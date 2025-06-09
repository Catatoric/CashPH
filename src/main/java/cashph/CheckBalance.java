package cashph;
public class CheckBalance {
    public double getBalance(int userId) {
        User u = SimpleDatabase.users.get(userId);
        return (u != null)? u.getBalance() : -1;
    }
}
