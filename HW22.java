public class HW22 {

public static void main(String[] args) {
        
        //значения из предыдущей задачи
        int base3D = 315; //цена билета на 3д фильм
        int dpercent = 15; //процент скидки 
        
        //диапазон мест
        int premst = 10; 
        int premen = 20;

        int prempercent = 5; //процент увеличения на премиум места
        int totseats = 30; //всего мест
        
        //для перебора 4х мест подряд
        int start = 0; 
        int end = 0;
        boolean fseats = false; //флаг
        
        //перебор 4х свободных мест подряд
        for (int i = 1; i <= totseats - 3; i++) {
            boolean allFree = true;
            
            //проверка на свободность
            for (int j = 0; j < 4; j++) {
                int curseat = i + j;
                
                //флаг на занято ли данное место
                boolean occup = false;
                
                // проверка диапазона 1-7
                if (curseat >= 1 && curseat <= 7) {
                    occup = true;
                }
                // проверка диапазона 11-13
                else if (curseat >= 11 && curseat <= 13) {
                    occup = true;
                }
                // проверка диапазона 15-17
                else if (curseat >= 15 && curseat <= 17) {
                    occup = true;
                }
                // проверка диапазона  22-24
                else if (curseat >= 22 && curseat <= 24) {
                    occup = true;
                }
                // проверка диапазона 26-30
                else if (curseat >= 26 && curseat <= 30) {
                    occup = true;
                }
                
                //если хоть одно место занято, то отпускаем флаг
                if (occup) {
                    allFree = false;
                    break;
                }
            }
            
            //если все норм, сохраняем места
            if (allFree) {
                start = i;
                end = i + 3;
                fseats = true;
                break;
            }
        }
        
        
        // Рассчитываем общую стоимость билетов
        double total = 0;
        
        // Места в порядке: Ваня (место 1), Андрей (место 2), Катя (место 3), Вика (место 4)
        for (int i = 0; i < 4; i++) {
            int curseat = start + i;
            double seatPr = 0;
            
            // Определяем цену билета
            if (i == 1) { // Андрей — без скидки
                seatPr = base3D;
            } else { // Ваня, Катя, Вика — со скидкой
                seatPr = base3D * (100 - dpercent) / 100.0;
            }

            // Наценка за премиум зону (места 10-20)
            if (curseat >= premst && curseat <= premen) {
                seatPr = seatPr * (100 + prempercent) / 100;
            }
            
            
            total += seatPr;
        }

        System.out.println("Номера мест в кино с " + end + " по " + start + " в обратном порядке");
        System.out.println("Общая стоимость билетов: " + total + " руб");
        
    }
}