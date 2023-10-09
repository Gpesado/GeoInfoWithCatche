package ipResercher.services;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import ipResercher.models.CountryInfoData;

@Controller
public class CountryCurrencyService {

    private static final String RESTCOUNTRIES_API_URL = "https://restcountries.com/v3.1/name/";

    /*
     * public String getCurrencyByCountryCode(@RequestParam String countryCode) {
     * try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
     * String apiUrl = RESTCOUNTRIES_API_URL + countryCode;
     * HttpGet httpGet = new HttpGet(apiUrl);
     * 
     * String jsonResponse =
     * EntityUtils.toString(httpClient.execute(httpGet).getEntity());
     * 
     * // Parse the JSON response to extract currency information
     * // You may need to use a JSON parsing library like Jackson or Gson
     * // to extract the currency information from the response.
     * 
     * // For example, if the JSON response contains a "currencies" array,
     * // you can extract the currency details from there.
     * 
     * // Sample code for JSON parsing using Jackson (you'll need to add Jackson as
     * a dependency):
     * ObjectMapper objectMapper = new ObjectMapper();
     * JsonNode jsonNode = objectMapper.readTree(jsonResponse);
     * String currency = jsonNode.get(0).get("currencies").fieldNames().next();
     * 
     * // Return the currency information
     * return currency;
     * } catch (Exception e) {
     * e.printStackTrace();
     * return "Error: Unable to fetch currency information.";
     * }
     * }
     */

    public CountryInfoData getCurrencyByCountryCode(@RequestParam String countryCode) {
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            String apiUrl = RESTCOUNTRIES_API_URL + countryCode;
            RestTemplate restTemplate = new RestTemplate();
            CountryInfoData countryInfoData = restTemplate.getForObject(apiUrl, CountryInfoData.class);

            // Return the currency information
            return countryInfoData;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}