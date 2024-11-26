import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class MarketDataService {
    private String apiKey;
    private Map<String, Double> prices;

    public MarketDataService() {
        this.apiKey = apiKey;
        prices = new HashMap<>();
    }

    public double getPrice(String currencyPair) {
        try {
            URL url = new URL("https://www.alphavantage.co/query?function=CURRENCY_EXCHANGE_RATE&from_currency=" + currencyPair.split("/")[0] + "&to_currency=" + currencyPair.split("/")[1] + "apikey=" + apiKey);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) !=null) {
                response.append(inputLine);
            }
            in.close();
            connection.disconnect();
            // Parse the JSON response to extract the price
            // Example: {"Realtime Currency Exchange Rate":{"1. Ask":1.1234,"2. Bid":1.1232}}
            // Extract the price from the JSON response
            double price = Double.parseDouble(response.toString().split(",")[1].split(":")[1].trim());
            return price;
        } catch (Exception e) {
            e.printStackTrace();
            return 0.0;
        }
    }
}
