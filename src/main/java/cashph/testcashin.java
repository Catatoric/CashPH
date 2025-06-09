package cashph;

public class TestCashIn {
    public static void main(String[] args) {
        // Setup: Create a user and add to the SimpleDatabase
        User u = new User(1, 100.0); // Assuming a constructor User(int id, double balance)
        SimpleDatabase.users.put(1, u);

        // Test CashIn
        CashIn cashIn = new CashIn();
        boolean result = cashIn.addBalance(1, 50.0);

        System.out.println("addBalance returned: " + result);
        System.out.println("New balance: " + u.getBalance());
        System.out.println("Transactions: " + SimpleDatabase.transactions);
    }
}
