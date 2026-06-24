import java.util.*;

public class Multiply_Nums {
    
    public static int productOf2Nums(int a, int b) {
        int sum = a * b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int sum = productOf2Nums(num2, num1);

        System.out.printf("Multiplication: %d", sum);

        sc.close();
    }

}
