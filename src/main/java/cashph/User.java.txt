
---

## src/main/java/cashph/**

### User.java
```java
package cashph;
public class User {
    private int userId;
    private String email;
    private String password;
    private double balance;
    public User(int userId, String email, String password, double balance) {
        this.userId = userId; this.email = email;
        this.password = password; this.balance = balance;
    }
    public int getUserId() { return userId; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }
    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }
}
