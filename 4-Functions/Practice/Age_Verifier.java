import java.util.*;

public class Age_Verifier {
    
    public static boolean legalAgeVerification(int age) {
        boolean isApplicable = true;

        if (age < 18) {
            isApplicable = false;
        }

        return isApplicable;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int a = sc.nextInt();

        if (legalAgeVerification(a) == true) {
            System.out.println("You're eligible to vote");
        }
        else {
            System.out.println("You're not eligible to vote");
        }

        sc.close();
    }

}
