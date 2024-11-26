public class Main {

    public static void main(String[] args) {
        String apiKey = "YOUR_API_KEY_HERE";
        TradingPlatform platform = new TradingPlatform();

        platform.getUserManager().register("U_1", "Sandz", "*******",5000.0);
        platform.getUserManager().register("U_2", "Kele", "*******",6000.0);

        User sandz = platform.getUserManager().login("U_1", "*******");
        User kele = platform.getUserManager().login("U_2", "*******");

        if (sandz != null) {
            System.out.println("Sandz logged in successfully");
        }
        if (kele != null) {
            System.out.println("Sandz logged in successfully");
        }

        platform.getUserManager().deposit("U_1", 2500.0);
        platform.getUserManager().deposit("U_2", 2000.0);

        platform.placeTrades("U_1", "EUR/USD", 1000);
        platform.placeTrades("U_2", "GBP/USD", 1000);

        platform.printUsers();
        platform.printTrades();
    }
}