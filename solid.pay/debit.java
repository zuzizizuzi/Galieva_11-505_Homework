package solid.pay;

public class debit implements paymeth, Returnable {

    @Override
    public void pay(int amount) {
        System.out.println("Оплата картой на: " + amount);
    }

   
}
