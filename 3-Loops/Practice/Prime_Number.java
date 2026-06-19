import java.util.*;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isPrime = true;

        if (num < 2) {
            isPrime = false;
        }

        else {
            for (int i = 2; i <= num - 1; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        
        if (isPrime == true) {
            System.out.println("Prime number");
        }
        else {
            System.out.println("Not a prime number");
        }

        sc.close();
    }
}
