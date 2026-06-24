import java.util.*;

public class Max_Num {
    
    public static int printMaxNumber(int a, int b) {
        if (a > b) {
            return a;
        }
        else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.printf("The greater number between %d and %d is %d", num1, num2, printMaxNumber(num1, num2));

        sc.close();
    }

}
