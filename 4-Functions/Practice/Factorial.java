import java.util.*;

public class Factorial {
    
    public static int factorial(int n) {
        if (n < 0) {
            System.out.println("Invalid number");
        }
        int fac = 1;
        for (int i = n; i >= 1; i--) {
            fac = fac * i; 
        }
        return fac;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.printf("Factorial of %d is %d", num, factorial(num));

        sc.close();
    }

}
