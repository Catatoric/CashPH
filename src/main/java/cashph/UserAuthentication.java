package cashph;
public class UserAuthentication {
    public boolean login(String email, String password) {
        for (User u: SimpleDatabase.users.values())
            if (u.getEmail().equals(email) && u.getPassword().equals(password))
                return true;
        return false;
    }
}
