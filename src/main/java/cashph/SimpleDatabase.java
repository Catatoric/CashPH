package cashph;
import java.util.*;
public class SimpleDatabase {
    public static Map<Integer, User> users = new HashMap<>();
    public static List<String> transactions = new ArrayList<>();
    static {
        users.put(1, new User(1, "juan@example.com", "password123", 5000));
        users.put(2, new User(2, "maria@example.com", "mypassword", 3000));
    }
}
