package cashph;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
public class TransactionsTest {
    Transactions t = new Transactions();
    @BeforeEach void setup() {
        SimpleDatabase.transactions.clear();
        SimpleDatabase.transactions.add("TX1");
        SimpleDatabase.transactions.add("TX2");
    }
    @Test void listsTransactions() {
        List<String> all = t.getAllTransactions();
        assertEquals(2, all.size());
        assertTrue(all.contains("TX1"));
        assertTrue(all.contains("TX2"));
    }
}
