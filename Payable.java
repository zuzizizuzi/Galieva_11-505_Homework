//import java.time.LocalDateTime;
public interface Payable {
    void pay(double amount);
    boolean isPaid();
}
