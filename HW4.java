import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] names = new String[5];
        int[] ages = new int[5];
        String[] emails = new String[5];
        String[] professions = new String[5];
        String[] universities = new String[5];

        for(int i = 0; i < 5; i++) {
            System.out.println("User information " + (i + 1) + "-");

            System.out.print("Your name - ");
            names[i] = scan.nextLine();

            System.out.print("Your age - ");
            ages[i] = scan.nextInt();
            scan.nextLine(); // consume остаток строки после числа

            System.out.print("Your email - ");
            emails[i] = scan.nextLine();

            System.out.print("Your profession - ");
            professions[i] = scan.nextLine();

            System.out.print("Your university - ");
            universities[i] = scan.nextLine();
        }

        //found longest name
        String mx = names[0];
        for (int i = 1; i < names.length; i++) {
            if (names[i].length() > mx.length()) {
                mx = names[i];
            }
        }

        //average age
        int agesum = 0;
        for (int i = 0; i < ages.length; i++) {
            agesum +=ages[i];
        }
        float average = (agesum / 5);

        String[] emailsbef = new String[5];
        for (int i = 0; i < emails.length; i++) {
            String email = emails[i];
            String bef = "";
            for (int j = 0; j < email.length(); j++) {
                if (email.charAt(j) == '@') {
                    break;
                }
                bef += email.charAt(j);
            }
            emailsbef[i] = bef;
        }

        int totprofcount = professions.length;

        //result
        System.out.println("Longest name - " + mx);
        System.out.println("Average age - " + average);
        System.out.println("Emails before @");
        for (int i = 0; i < emailsbef.length; i++) {
            System.out.println((i+1) + "- " + emailsbef[i]);
        }

        System.out.println("Professions count " + totprofcount); 
        System.out.println("All professions:"); 
        for (int i = 0; i < professions.length; i++) { 
            System.out.println("- " + professions[i]);

        }

        System.out.println("All universities:");
        for (int i = 0; i < universities.length; i++) {
            System.out.println("- " + universities[i]);
        }
        
        //scanner.close();




    }
}