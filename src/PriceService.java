import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class PriceService {
    private Map <String, Double> prices;

    public PriceService() {
        prices = new HashMap<>();

        prices.put("GBP/USD", 1.28287);
        prices.put("EUR/USD", 1.06148);
        prices.put("US 100", 21043.2);
    }

    public double getPrice(String currencyPair) {
        return prices.getOrDefault(currencyPair, 0.0);
    }

    public void updatedPrices() {
        Random rand = new Random();
        for (String currencyPair : prices.keySet()) {
            prices.put(currencyPair, prices.get(currencyPair) * (1 + (rand.nextDouble() - 0.5) / 10));
        }
    }

    public void printPrices() {
        for (Map.Entry<String, Double> entry : prices.entrySet()) {
            System.out.println(entry.getKey() + ": $" + entry.getValue());
        }
    }
}
