import java.util.*;

public class Operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter the operator: ");
        String ops = sc.next();

        switch (ops) {
            case "+":
                System.out.printf("Addition : %d", num1 + num2);
                break;
        
            case "-":
                System.out.printf("Subtraction : %d", num1 - num2);
                break;

            case "*":
                System.out.printf("Multiplication : %d", num1 * num2);
                break;

            case "/":
                if (num2 == 0) {
                    System.err.println("We can't divide the number with 0");
                }
                else {
                    System.out.printf("Division : %d", num1 / num2);
                }
                break;

            default:
                System.out.println("Invalid input");
                break;
        }

        sc.close();
    }
}
