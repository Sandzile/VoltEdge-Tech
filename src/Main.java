public class Main {

    public static void main(String[] args) {

        TradingPlatform platform = new TradingPlatform();

        User user1 = new User("U001", "Sandz", 5000.0);
        User user2 = new User("U002", "Kele", 6000.0);

        platform.addUser(user1);
        platform.addUser(user2);

        platform.updatePrices();
        platform.printPrices();

        Trades trade1 = new Trades("T001", "U001", "GBP/USD", 15, platform.priceService.getPrice("GBP/USD"));
        Trades trade2 = new Trades("T002", "U002", "EUR/USD", 20, platform.priceService.getPrice("EUR/USD"));

        platform.addTrades(trade1);
        platform.addTrades(trade2);

        platform.printUsers();
        platform.printTrades();
        platform.printTransactionHistory("U001");
        platform.printTransactionHistory("U002");
    }
}