package cashph;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CheckBalanceTest {
    CheckBalance cb = new CheckBalance();
    @Test void validUserBalance() { assertEquals(5000, cb.getBalance(1)); }
    @Test void invalidUserBalance() { assertEquals(-1, cb.getBalance(999)); }
}
