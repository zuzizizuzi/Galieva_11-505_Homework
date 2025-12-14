package solid.pay;

public class store {
    private Transaction transaction;

    public Store(Transaction transaction) {
        this.transaction = transaction;
    }

    public void toPay(int amount) {
        transaction.pay(amount);
    }

}
