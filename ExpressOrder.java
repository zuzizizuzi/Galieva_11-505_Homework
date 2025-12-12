//наследник экспресс доставка
public class ExpressOrder extends AbstractOrder {
            private final int deliveryDays;

            public ExpressOrder(String number, int deliveryDays) {
                super(number);
                if (deliveryDays > 0) {
                    this.deliveryDays = deliveryDays;
                } else {
                    throw new IllegalArgumentException("Срок доставки должен быть > 0");
                }
                addAmount(500); // Надбавка за срочность
            }
            

            @Override
            public double calculateFinalAmount() {
                return amount; // Уже включает надбавку
            }

            public int getDeliveryDays() {
                return deliveryDays;
            }

            @Override
            public String getInfo() {
                return super.getInfo() + ", Срок доставки: " + deliveryDays + " дн.";
            }
        
}
