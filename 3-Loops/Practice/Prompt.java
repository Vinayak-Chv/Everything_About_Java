import java.util.*;

public class Prompt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isRunning = true;

        do {
            System.out.println("\n1.Balance\n2.Deposit\n3.Exit");

            System.out.print("Enter a choice number: ");
            int num = sc.nextInt();
            if (num == 1) {
                System.out.println("Balance");
            }
            else if (num == 2) {
                System.out.println("Deposit");
            }
            else if (num == 3) {
                System.out.println("Goodbye");
                isRunning = false;
            }
            else {
                System.out.println("Invalid input");
            }
        }while(isRunning);

        sc.close();
    }
}
