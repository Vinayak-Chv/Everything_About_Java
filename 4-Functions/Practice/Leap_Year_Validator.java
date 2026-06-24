import java.util.*;

public class Leap_Year_Validator {
    
    public static boolean printLeapYear(int a) {
        if (a % 400 == 0) {
            return true;
        }
        if (a % 100 == 0) {
            return false;
        }
        if (a % 4 == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (printLeapYear(year) == true) {
            System.out.println("Leap year");
        }
        else {
            System.out.println("Not a leap year");
        }

        sc.close();
    }

}
