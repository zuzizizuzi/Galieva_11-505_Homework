//оптовый заказ наследник
public class WholesaleOrder extends AbstractOrder {
            private int itemsCount;

            public WholesaleOrder(String number, int itemsCount) {
                super(number);
                if (itemsCount >= 10) {
                    this.itemsCount = itemsCount;
                } else {
                    throw new IllegalArgumentException("Опт: минимум 5 товаров");
                }
                // Скидка 10% для оптовых заказов
                addAmount(-amount * 0.1);
            }

            @Override
            public double calculateFinalAmount() {
                return Math.max(amount, 0); // Не меньше нуля
            }

            public int getItemsCount() {
                return itemsCount;
            }

            @Override
            public String getInfo() {
                return super.getInfo() + ", Кол-во товаров: " + itemsCount;
            }
        

}
