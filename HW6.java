
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class HW6 {
    public static void main(String[] args) {

        System.out.println(mtd1("komok")); 
        mtd2("zuzizizuzi");
        mtd3("kotop");
        mtd4("ararat");
        mtd5("I know who are u");
        mtd6("Hello", "hello");
        mtd7("89173665248");
        mtd8("Я работаю 3.5 часа на 56 картах");
        mtd9("мои расклады   всегда  сбываются  ");
        mtd10("zuzizizuzi@yandex.ru");
        System.out.println(mtd11("cards", 45.15254));

        String[] elem = {"я", "ты", "он", "она", "оно"};
        System.out.println(mtd12(elem));

    }
//Напишите метод, который проверяет, является ли строка палиндромом (читается одинаково в обе стороны), игнорируя регистр.

    public static boolean mtd1(String str) {
        int len = str.length();
        for (int i = 0; i < (len / 2); i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }

//ток первое вхождение символов    
    public static void mtd2(String str){
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == str.indexOf(str.charAt(i))) { //возвращает первый индекс символа в строке.
                res += str.charAt(i);
            }
        }
        System.out.println(res);    
    }

//первый не повтор
    public static void mtd3(String str) {
        for (int i = 0; i < str.length(); i++) {
            char yeap = str.charAt(i);
            if (str.indexOf(yeap) == str.lastIndexOf(yeap)) {
                System.out.println(yeap);
            } else {
                System.out.println("there is nothing(((");
            }

        }
    }

//замена    

    public static void mtd4(String str) {
        System.out.println(str.replace("a", "@"));    
    
    }

//колво слов    

    public static void mtd5(String str) {
        String[] parts = str.split("\\s+");
        System.out.println(parts.length);
    }

//проверка двух строк    

    public static void mtd6(String s1, String s2) {
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("строки равны");
        } else {

            System.out.println("строки не равны");
        }
    }

    //проверка на росномер
    //с сайта метанит
    public static void mtd7(String str) {
        boolean res = str.matches("(\\+7|8)\\d{10}"); // ("(\\8*)\\d{10}"));

        if (res) {
            System.out.println("строка соответствует формату рос.номера");
        } else {
            System.out.println("строка не соответствует формату рос.номера");
        }


    }

    //поиск чисел
    
    public static void mtd8(String text) {
        // Регулярное выражение для поиска целых и дробных чисел
        String reg = "-?\\d+(\\.\\d+)?";
        Pattern pat = Pattern.compile(reg);
        Matcher mat = pat.matcher(text);

        System.out.println("Найденные числа:");
        while (mat.find()) {
            System.out.println(mat.group());
        }
    }
    
    //замена пробелов
    public static void mtd9(String text) {
        
        String ret = text.replaceAll(" +", " ");
        System.out.println(ret);
    }


//почта(хз)
    public static boolean mtd10(String str) {
        boolean r = str.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
    
        System.out.println(r);
        return r; //возврат реза
    }


    
//формат цены
    public static String mtd11(String name, double price) {
        return String.format("Товар: %s, Цена: %.2f руб.", name, price);
    }


//обЪединение масссива
    public static String mtd12(String[] array) {

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            result.append(array[i]);
            if (i < array.length - 1) {
                result.append("; ");
            }
        }
    
    return result.toString();
    }
}

    






