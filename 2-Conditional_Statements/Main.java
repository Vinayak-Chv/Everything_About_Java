import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age > 18) {
            System.out.println("You're an Adult");
        }
        else {
            System.out.println("You're not an Adult");
        }

        sc.close();
    }
}
