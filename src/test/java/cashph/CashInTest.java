package cashph;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
public class CashInTest {
    CashIn ci = new CashIn();
    @BeforeEach void reset() {
        SimpleDatabase.users.get(1).setBalance(5000);
        SimpleDatabase.transactions.clear();
    }
    @Test void addsMoney() {
        assertTrue(ci.addBalance(1,1000));
        assertEquals(6000, SimpleDatabase.users.get(1).getBalance());
    }
    @Test void rejectsNegative() { assertFalse(ci.addBalance(1,-500)); }
}
