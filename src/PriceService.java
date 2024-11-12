import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class PriceService {
    private Map < String, Double > prices;

    public PriceService() {
        prices = new HashMap<>();

        prices.put("GBP/USD", 1.28287);
        prices.put("EUR/USD", 1.06148);
        prices.put("US 100", 21043.2);
    }

    public void updatedPrices() {
        Random rand = new Random();
        for (String stockSymbol : prices.keySet()) {
            prices.put(stockSymbol, prices.get(stockSymbol) * (1 + (rand.nextDouble() - 0.5) / 10));
        }
    }

    public void printPrices() {
        for (Map.Entry<String, Double> entry : prices.entrySet()) {
            System.out.println(entry.getKey() + ": $" + entry.getValue());
        }
    }
}
