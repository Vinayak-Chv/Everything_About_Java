import java.util.*;

public class Add_Nums {

    public static int calculateSum(int a, int b) {
        System.out.printf("Sum of 2 numbers is %d", a, b, a + b);
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        calculateSum(num1, num2);

        sc.close();
    }
}
