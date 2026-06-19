import java.util.*;

public class Power_Finder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        int base = sc.nextInt();
        System.out.print("Enter the power number: ");
        int power = sc.nextInt();
        int result = 1;

        for (int i = 1; i <= power; i++) {
            result = result * base;
        }

        System.out.printf("The result is : %d", result);

        sc.close();
    }
}
