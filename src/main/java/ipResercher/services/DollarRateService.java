package ipResercher.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import ipResercher.models.ExchangeRatesData;

@Service
public class DollarRateService {

    @Value("${exchangeRates.apiKey}")
    private String apiKey;

    private final String EXCHANGE_RATE_API_URL = "https://v6.exchangerate-api.com/v6/";
    private final String EXCHANGE_RATE_API_URL_FINAL = "/latest/USD";

    public Double getExchangeRateForCountry(String countryCurrencyCode) {
        String apiUrl = EXCHANGE_RATE_API_URL + apiKey + EXCHANGE_RATE_API_URL_FINAL;
        RestTemplate restTemplate = new RestTemplate();
        ExchangeRatesData exchangeRatesData = restTemplate.getForObject(apiUrl, ExchangeRatesData.class);
        
        // Aquí, ExchangeRatesData sería una clase que representa la respuesta JSON de la API
        // Deberás definir una clase correspondiente o utilizar una biblioteca de análisis JSON como Jackson.

        if (exchangeRatesData != null && exchangeRatesData.getConversion_rates().containsKey(countryCurrencyCode)) {
            return exchangeRatesData.getConversion_rates().get(countryCurrencyCode);
        } else {
            return null; // La tasa de cambio para la moneda del país no se encontró
        }
    }
}
