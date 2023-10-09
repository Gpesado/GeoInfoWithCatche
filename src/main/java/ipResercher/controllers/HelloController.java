package ipResercher.controllers;

import java.io.IOException;
import java.net.InetAddress;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.maxmind.geoip2.exception.GeoIp2Exception;

import ipResercher.models.CountryInfoData;
import ipResercher.services.CountryCurrencyService;
import ipResercher.services.GeoIpService;

@RestController
public class HelloController {

    @Autowired
    private GeoIpService getIpService;

    @Autowired
    private CountryCurrencyService countryCurrencyService;

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/test")
    public ResponseEntity<String> getCountryByIP(@RequestParam String ip) {
        try {
            InetAddress ipAddress = InetAddress.getByName(ip);
            // CountryResponse countryResponse = databaseReader.country(ipAddress);

            // String countryName = countryResponse.getCountry().getName();
            String countryName = "ARGENTINA";
            String currency = "$830";
            return ResponseEntity.ok("El país de procedencia de la IP " + ip + " es " + countryName
                    + " y su moneda en dolares vale " + currency);
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(500).body("Error al obtener la información de la IP");
        }
    }

    @GetMapping("/getCountryAndCurrencyByIP")
    public ResponseEntity<String> getCountryAndCurrencyByIP(@RequestParam String ip) throws GeoIp2Exception {
        try {
            String countryName = getIpService.getCountryByIP(ip);
            CountryInfoData currency = countryCurrencyService.getCurrencyByCountryCode(countryName);
            return ResponseEntity.ok("El país de procedencia de la IP " + ip + " es " + countryName
                    + " y su moneda en dolares vale " + currency.getCurrencies());
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(500).body("Error al obtener la información de la IP");
        }
    }

}
