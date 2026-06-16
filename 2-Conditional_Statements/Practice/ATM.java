import java.util.*;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the balance amount: ");
        int balance = sc.nextInt();

        System.out.print("Enter the withdrawl amount: ");
        int withdraw = sc.nextInt();

        if (withdraw % 100 != 0) {
            System.out.println("Invalid amount");
        }
        else if (withdraw > balance) {
            System.out.println("Insufficient balance");
        }
        else {
            System.out.println("Success");
        }

        sc.close();
    }
}
