package cashph;
public class CashTransfer {
    public boolean transfer(int fromUid, int toUid, double amt) {
        if (amt <= 0) return false;
        User fu = SimpleDatabase.users.get(fromUid);
        User tu = SimpleDatabase.users.get(toUid);
        if (fu == null || tu == null) return false;
        if (fu.getBalance() < amt) return false;
        fu.setBalance(fu.getBalance() - amt);
        tu.setBalance(tu.getBalance() + amt);
        SimpleDatabase.transactions.add(
            "Transfer: PHP " + amt + " from User " + fromUid + " to User " + toUid
        );
        return true;
    }
}
