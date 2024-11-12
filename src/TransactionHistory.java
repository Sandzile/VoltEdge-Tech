import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransactionHistory {
    private Map<String, List<Trades>> userTrades;

    public TransactionHistory() {
        userTrades = new HashMap<>();
    }

    public void addTrade(Trades trade) {
        userTrades.putIfAbsent(trade.getUserid(), new ArrayList<>());
        userTrades.get(trade.getUserid()).add(trade);
    }

    public List<Trades> getTradesByUser(String userId){
        return userTrades.getOrDefault(userId, new ArrayList<>());
    }

    public void printTransactionHistory(String userId) {
        List<Trades> trades = getTradesByUser(userId);

        if (trades.isEmpty()) {
            System.out.println("No trades found for: " + userId);
        } else {
            for (Trades trade : trades) {
                System.out.println(trades);
            }
        }
    }

}
