public class HW7 {
    public static void main(String[] args) {
        // 1. Обычный заказ
        AbstractOrder reg = new AbstractOrder("REG-001") {
            @Override
            public double calculateFinalAmount() {
                return 0;
            }
        };

        reg.addAmount(1000);
        reg.updateTracking("В обработке");
        reg.pay(1000);
        System.out.println(reg.getInfo());

        // 2. Экспресс‑заказ
        ExpressOrder exp = new ExpressOrder("EXP-002", 1);
        exp.addAmount(2000);
        exp.updateTracking("Отправлен");
        System.out.println(exp.getInfo());

        // 3. Оптовый заказ (15 товаров)
        WholesaleOrder wh = new WholesaleOrder("WH-003", 15);
        wh.addAmount(5000);
        wh.updateTracking("Собран");
        wh.pay(4500); // Уже со скидкой
        System.out.println(wh.getInfo());

    }


}
