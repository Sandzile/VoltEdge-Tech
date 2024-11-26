public class User {

    private String userId;
    private String name;
    private String password;
    private double balance;

    public User(String userId, String name,String password, double balance) {
        this.userId = userId;
        this.name = name;
        this.password = password;
        this.balance = balance;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String name) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "User{" + "userId ='" + userId + '\'' +
                ", name = " + name + '\'' +
                ", balance = " + balance + '}';
    }
}
