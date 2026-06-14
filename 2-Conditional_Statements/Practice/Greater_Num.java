import java.util.*;

public class Greater_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter First Number: ");
        int num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.println("Equal");
        } 
        else if (num1 > num2) {
            System.out.println("First number is greater");
        }
        else {
            System.out.println("Second number is greater");
        }
        sc.close();
    }
}
