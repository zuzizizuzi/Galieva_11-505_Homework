import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод имени
        System.out.print("Здравствуйте! Введите ваше имя: ");
        String name = scanner.nextLine();

        // Ввод типа операции
        System.out.print("Введите тип операции и укажите ее номер (1.Сумма, 2.Вычитание, 3.Умножение, 4.Деление): ");
        int operation = scanner.nextInt();

        // Ввод двух чисел
        System.out.print("Введите первое число: ");
        float num1 = scanner.nextFloat();

        System.out.print("Введите второе число: ");
        float num2 = scanner.nextFloat();

        
        double res = 0;
        boolean  flag = true;

        switch (operation) {
            case 1:
                res = num1 + num2;
                flag = true;
                break;
            case 2:
                res = num1 - num2;
                flag = true;
                break;
            case 3:
                res = num1 * num2;
                flag = true;
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Ошибка, т.к. деление на 0 невозможно.");
                    flag = false;
                } else {
                    res = num1 / num2;
                    flag = true;
                }
                break;
            default:
                System.out.println("Ошибка: неизвестная операция.");
                flag = false;
                break;
        }

        // Вывод результата, если операция корректна
        if (flag) {
            System.out.printf(name + ", ваш результат: " + res);
        }

        scanner.close();
    }
}