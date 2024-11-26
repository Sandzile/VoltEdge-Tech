import java.util.HashMap;
import java.util.Map;

public class UserManager {
    private Map<String, User> users;

    public UserManager() {
        users = new HashMap<>();
    }

    public boolean register(String userId, String name, String password, double initialBalance) {
        if (users.containsKey(userId)) {
            return false;
        }
        User user = new User(userId, name, password, initialBalance);
        return true;
    }

    public User login(String userId, String password) {
        User user = users.get(userId);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }

    public boolean deposit(String userId, double amount){
        User user = users.get(userId);
        if (user !=null && amount > 0) {
            user.setBalance((user.getBalance() + amount));
            return true;
        }
        return false;
    }

    public boolean withdraw(String userId, double amount) {
        User user = users.get(userId);
        if (user != null && amount > 0 && user.getBalance() >= amount) {
            user.setBalance(user.getBalance() - amount);
            return true;
        }
        return false;
    }

    public void printUsers() {
    }
}
