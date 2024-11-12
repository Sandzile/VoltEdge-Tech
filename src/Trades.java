import java.time.LocalDateTime;

public class Trades {

    private String tradeId;
    private String userId;
    private String stockSymbol;
    private int quantity;
    private double price;
    private LocalDateTime timestamp;

    public Trades(String tradeId, String userId, String stockSymbol, int quantity, double price) {
        this.tradeId = tradeId;
        this.userId = userId;
        this.stockSymbol = stockSymbol;
        this.quantity = quantity;
        this.price = price;
        this.timestamp = LocalDateTime.now();
    }

    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public String getUserid() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getStockSymbol() {
        return stockSymbol;
    }

    public void setStockSymbol(String stockSymbol) {
        this.stockSymbol = stockSymbol;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "Trade{" + tradeId + '\'' +
                ", userId = " + userId + '\'' +
                ", stockSymbol = " + stockSymbol + '\'' +
                ", price = " + price +
                ", timestamp = " + timestamp +
                '}';
    }

}
