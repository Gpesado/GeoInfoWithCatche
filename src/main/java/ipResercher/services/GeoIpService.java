package ipResercher.services;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.maxmind.geoip2.DatabaseReader;
import com.maxmind.geoip2.exception.GeoIp2Exception;
import com.maxmind.geoip2.model.CountryResponse;

@Service
public class GeoIpService {

    @Value("${geoip.databasePath}")
    String databasePath;

    public String getCountryByIP(@RequestParam String ip) throws GeoIp2Exception {
        try {
            File database = new File(databasePath);
            DatabaseReader reader = new DatabaseReader.Builder(database).build();

            InetAddress ipAddress = InetAddress.getByName(ip);
            CountryResponse countryResponse = reader.country(ipAddress);

            String countryName = countryResponse.getCountry().getName();
            return countryName;
        } catch (IOException e) {
            e.printStackTrace();
            return "Error al obtener la información de la IP";
        }
    }
}