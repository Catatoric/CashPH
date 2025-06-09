package cashph;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
public class CashTransferTest {
    CashTransfer tr = new CashTransfer();
    @BeforeEach void reset() {
        SimpleDatabase.users.get(1).setBalance(5000);
        SimpleDatabase.users.get(2).setBalance(3000);
        SimpleDatabase.transactions.clear();
    }
    @Test void transfersCorrectly() {
        assertTrue(tr.transfer(1,2,1000));
        assertEquals(4000, SimpleDatabase.users.get(1).getBalance());
        assertEquals(4000, SimpleDatabase.users.get(2).getBalance());
    }
    @Test void insufficientFunds() { assertFalse(tr.transfer(2,1,5000)); }
}
