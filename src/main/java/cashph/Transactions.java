package cashph;
import java.util.List;
public class Transactions {
    public List<String> getAllTransactions() {
        return SimpleDatabase.transactions;
    }
}
