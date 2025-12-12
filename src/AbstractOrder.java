//сразу абстрактный метод
public abstract class AbstractOrder implements Payable, Trackable {
    private final String number;
    protected double amount;
    private String status;

        //private LocalDateTime creationTime;

    public abstract double calculateFinalAmount();

    public AbstractOrder(String number) {
        this.number = number;
        this.amount = 0.0;
            //this.creationTime = LocalDateTime.now();
        this.status = "Создан";
    }

    public String getNumber() {
        return number;
    }

    public double getAmount() {
        return amount;
    }

//        public LocalDateTime getTime() {
//            return creationTime;
//        }

    public void addAmount(double amountchange) {
        if (amountchange > 0) {
            this.amount += amountchange;
        }
    }

        // Реализация из интерфейса Trackabl
    @Override
    public String getTrackingStatus() {
        return status;
    }

    @Override
    public void updateTracking(String statuschanage) {
        this.status = statuschanage;
    }

        //Payable
    private boolean paid = false;

    @Override
    public void pay(double amountchange) {
        if (amountchange >= amount && amountchange > 0) {
            this.paid = true;
            System.out.println("Заказ " + number + " оплачен на сумму " + amountchange);
        } else {
            System.out.println("Ошибка: сумма оплаты недостаточна или неверна");
        }
    }

    @Override
    public boolean isPaid() {
        return paid;
    }
        //вывод информации

    public String getInfo() {
        return "Номер: " + number +
                ", Сумма: " + amount +
                ", Статус отслеживания: " + status +
                ", Оплачен: " + (paid ? "Да" : "Нет");
    }
}

