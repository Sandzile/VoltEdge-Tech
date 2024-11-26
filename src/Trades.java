import java.time.LocalDateTime;

public class Trades {

    private String tradeId;
    private String userId;
    private String currencyPair;
    private int quantity;
    private double price;
    private LocalDateTime timestamp;

    public Trades(String tradeId, String userId, String currencyPair, int quantity, double price) {
        this.tradeId = tradeId;
        this.userId = userId;
        this.currencyPair = currencyPair;
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

    public String getCurrencyPair() {
        return currencyPair;
    }

    public void setCurrencyPair(String currencyPair) {
        this.currencyPair = currencyPair;
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
                ", currencyPair = " + currencyPair + '\'' +
                ", price = " + price +
                ", timestamp = " + timestamp +
                '}';
    }

}
