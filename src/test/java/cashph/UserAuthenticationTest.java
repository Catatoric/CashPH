package cashph;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class UserAuthenticationTest {
    UserAuthentication auth = new UserAuthentication();
    @Test void validLogin() { assertTrue(auth.login("juan@example.com","password123")); }
    @Test void invalidPassword() { assertFalse(auth.login("juan@example.com","wrong")); }
    @Test void invalidEmail() { assertFalse(auth.login("noone@example.com","password123")); }
}
