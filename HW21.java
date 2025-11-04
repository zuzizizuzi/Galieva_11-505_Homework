public class HW21 {

public static void main(String []args) {
        //Переменные ( )
        int vanjaMaxPrice = 500;
        int andreyMaxPrice = 200;
        int katyaMinPrice = 300;
        int vikaForAndrey = 200;
        int step3D = 35; //размер шагов 3д фильма
        int step2D = 27; //размер шагов 2д фильма
        double discount = 0.15; //Скидка по студенческому 15%
        boolean andrey2D = true; //Андрей сможет только на 2д 
        boolean katyaNew = true; //Катя пойдет на новый фильм (2д и 3д)
        boolean vanja3D = true; //Ваня пойдет на 3д
        boolean vikaAll = true; //Вика пойдет со всеми на любой фильм
        

        //Переменные для результатов
        String filmType = "";
        int origPrice = 0; //стоимость билета без скидки
        double dPrice = 0; //стоимость билета со скидкой

        //Проверка 3д фильма
        boolean go3D = false;
        int price = step3D;


        //Перебор цены на 3д фильм
        while (price <= vanjaMaxPrice && price <= katyaMinPrice + 100) { // приблизительно подбираем цену
            if (price >= katyaMinPrice && price <= vanjaMaxPrice) { //Проверяем ограничение Вани и Кати (цена не выше 500 и не ниже 300) 
                //Проверяем, чтобы Андрей смог пойти (бюджет 400)
                if (price <= andreyMaxPrice + vikaForAndrey) { //Если все подходит, сохраняется скидка и рассчитывается цена
                    go3D = true;
                    filmType = "3D";
                    origPrice = price;
                    dPrice = origPrice * (1 - discount);
                    break;
                }
            }
            price = price + step3D;
        }

        if (!go3D) { // Проверяем 2д, если 3д не подходит          
            price = step2D;
            while (true) {
                if (price >= katyaMinPrice) {
                    //Проверяем подходит ли цена Кате и Андрею
                    if (price <= andreyMaxPrice) {
                        // Если 3д не подошло, выбираем 2д, рассчитываем цену и скидку
                        go3D = false;
                        filmType = "2D";
                        origPrice = price;
                        dPrice = origPrice * (1 - discount);
                        break;
                    }
                }
                price = price + step2D;
            }
        }

        // Вывод результата
        System.out.println("Ребята пойдут на " + filmType + " фильм");
        System.out.println("Цена билета без скидки:" + origPrice + " руб");
        System.out.println("Цена билета со скидкой (для Вани, Кати и Вики):" + dPrice + " руб");
    }
}