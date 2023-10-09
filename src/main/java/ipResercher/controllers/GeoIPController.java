package ipResercher.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.maxmind.geoip2.exception.GeoIp2Exception;

import ipResercher.services.GeoIpService;

@Controller
public class GeoIPController {

    @Autowired
    private GeoIpService service;

    @GetMapping("/getCountryByIP")
    @ResponseBody
    public String getCountryByIP(@RequestParam String ip) throws GeoIp2Exception {
        return "El país de procedencia de la IP " + ip + " es " + service.getCountryByIP(ip);
    }
}