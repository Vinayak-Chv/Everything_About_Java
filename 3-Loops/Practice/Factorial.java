import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int fact = 1;

        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                fact = fact * i;
            }
            System.out.printf("Factorial of %d is %d", num, fact);
        }

        sc.close();
    }
}