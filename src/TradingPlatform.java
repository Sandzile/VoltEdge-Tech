import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TradingPlatform {
    private Map<String, User> users;
    private List<Trades> trades;
    private PriceService priceService;
    private TransactionHistory transactionHistory;

    public TradingPlatform() {
        users = new HashMap<>();
        trades = new ArrayList<>();
        priceService = new PriceService();
        transactionHistory = new TransactionHistory();
    }

    public void addUser(User user) {
        users.put(user.getUserId(), user);
    }

    public void addTrades(Trades trade) {
        trades.add(trade);
        transactionHistory.addTrade(trade);
    }

    public User getUser(String userId) {
        return users.get(userId);
    }

    public List<Trades> getTrades() {
        return new ArrayList<>(trades);
    }

    public void updatePrices() {
        priceService.updatedPrices();
    }

    public void printPrices() {
        priceService.printPrices();
    }

    public void printUsers() {
        for (User user : users.values()) {
            System.out.println(user);
        }
    }

    public void printTrades() {
        for (Trades trade : trades) {
            System.out.println(trades);
        }
    }

    public void printTransactionHistory(String userId) {
        transactionHistory.printTransactionHistory(userId);
    }
}
