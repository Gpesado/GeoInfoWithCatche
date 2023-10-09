package ipResercher.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ipResercher.models.CountryInfoData;
import ipResercher.services.CountryCurrencyService;

@Controller
public class CountryCurrencyController {

    @Autowired
    private CountryCurrencyService service;

    @GetMapping("/getCountryCurrency")
    @ResponseBody
    public CountryInfoData getCurrencyByCountryCode(@RequestParam String countryCode) {
        return service.getCurrencyByCountryCode(countryCode);
    }
}