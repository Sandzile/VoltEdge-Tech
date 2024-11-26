import java.util.ArrayList;
import java.util.List;

public class TradingPlatform {
    private UserManager userManager;
    private List<Trades> trades;
    public MarketDataService marketDataService;

    public TradingPlatform() {
        userManager = new UserManager();
        marketDataService = new MarketDataService();
        trades = new ArrayList<>();
    }

    public UserManager getUserManager () {
        return userManager;
    }

    public void placeTrades(String userId, String currencyPair, int quantity) {
        double price = marketDataService.getPrice(currencyPair);
        Trades trade = new Trades("T" + (trades.size() + 1), userId, currencyPair, quantity, price);
        trades.add(trade);
    }

    public void printTrades() {
        for (Trades trade : trades) {
            System.out.println(trades);
        }
    }

    public void printUsers() {
        userManager.printUsers();
    }
}
