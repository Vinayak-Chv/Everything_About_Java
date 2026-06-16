import java.util.*;

public class Movie_Checker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age > 10) {
            if (age < 18 || age > 60) {
                System.out.println("Discounted tickets");
            }
            else {
                System.out.println("Regular Tickets");
            }
        }
        else {
            System.out.println("Invalid input");
        }

        sc.close();
    }
}