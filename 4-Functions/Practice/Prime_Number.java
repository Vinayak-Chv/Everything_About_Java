import java.util.*;

public class Prime_Number {

    public static boolean primeVerifier(int a) {
        boolean isPrime = true;

        if (a < 2) {
            isPrime = false;
        }
        else {
            for (int i = 2; i <= a - 1; i++) {
                if (a % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (primeVerifier(num) == true) {
            System.out.println("Prime number");
        }
        else {
            System.out.println("Not a prime number");
        }

        sc.close();
    }

}
