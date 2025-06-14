package cashph;
public class CashIn {
    public boolean addBalance(int userId, double amount) {
        if (amount <= 0) return false;
        User u = SimpleDatabase.users.get(userId);
        if (u != null) {
            double nb = u.getBalance() + amount;
            u.setBalance(nb);
            SimpleDatabase.transactions.add("CashIn: User " + userId + " added PHP " + amount);
            return true;
        }
        return false;
    }
}
