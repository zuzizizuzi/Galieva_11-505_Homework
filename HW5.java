import java.util.Scanner;

public class HW5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Массив нужных предметов и вопросов к ним
        String[] items = {"кастрюля", "вода", "мясо", "овощи", "соль", "тарелки"};
        String[] questions = {
            "Есть ли кастрюля? (yes/no): ",
            "Есть ли вода? (yes/no): ",
            "Есть ли мясо? (yes/no): ",
            "Есть ли овощи? (yes/no): ",
            "Есть ли соль? (yes/no): ",
            "Есть ли тарелки? (yes/no): "
        };

        // Считаем, сколько предметов есть
        int found = 0;
        for (int i = 0; i < items.length; i++) {
            if (ask(scanner, questions[i])) {
                found++;
                System.out.println("found: " + items[i]);
            } else {
                System.out.println("not found: " + items[i]);
            }
        }

        System.out.println("found " + found + " from " + items.length);

        if (found != items.length) {
            System.out.println("Sorry, I can`t cook, don`t have enought products");
            scanner.close();
            return;
        }

        // Готовим суп

        if (!boilWater()) {
            System.out.println("The water did not boil");
            scanner.close();
            return;
        }

        addProducts();
        
        if (!cookSoup()) {
            System.out.println("Something went wrong.");
            scanner.close();
            return;
        }

        serveSoup();
        scanner.close();
    }

    // Спрашивает "да/нет" и возвращает true/false
    public static boolean ask(Scanner sc, String question) {
    while (true) {
        System.out.print(question);
        String answer = sc.nextLine();

        if (answer.equals("yes")) {
            return true;
        } else if (answer.equals("no")) {
            return false;
        } else {
            System.out.println("please, ansewer 'yes' or 'no'.");
        }
    }
}

    // Кипятим воду
    public static boolean boilWater() {
        System.out.println("Boil the water...");
        for (int temp = 20; temp <= 100; temp += 20) {
            System.out.println("Temperature: " + temp + "°C");
        }
        System.out.println("super, water is boil!!!");
        return true;
    }

    // Добавляем продукты
    public static void addProducts() {
        System.out.println("Добавляем продукты:");
        String[] products = {"мясо", "овощи", "соль"};
        for (String p : products) {
            System.out.println("- " + p);
        }
        System.out.println("Все продукты в кастрюле!");
    }

    // Варим суп
    public static boolean cookSoup() {
        System.out.println("Варим суп");
        for (int minutes = 0; minutes <= 30; minutes += 10) {
            System.out.println("Прошло " + minutes + " минут");
            if (minutes == 10) {
                System.out.println("Суп готовится");
            } else if (minutes == 20) {
                System.out.println("Суп почти готов");
            } else if (minutes == 30) {
                System.out.println("Суп готов!");
            }
        }
        return true;
    }

    // Подаем суп
    public static void serveSoup() {
        System.out.println("Подаем суп:");
        System.out.println("Разливаем по тарелкам...");
        System.out.println("Приятного аппетита!");
    }
}