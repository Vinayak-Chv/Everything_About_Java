import java.util.*;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        while (a != b) {
            if (a > b) {
                a = a - b;
            }
            else if (b > a) {
                b = b - a;
            }
        }
        System.out.printf("GCD: %d", a);

        sc.close();
    }
}
