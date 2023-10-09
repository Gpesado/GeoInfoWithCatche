package ipResercher.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ipResercher.services.DollarRateService;

@RestController
@RequestMapping("/dollar-rate")
public class DollarRateController {

    @Autowired
    private DollarRateService exchangeRateService;

    @GetMapping("/{countryCurrencyCode}")
    public Double getDollarRate(@PathVariable String countryCurrencyCode) {
        return exchangeRateService.getExchangeRateForCountry(countryCurrencyCode);
    }
}