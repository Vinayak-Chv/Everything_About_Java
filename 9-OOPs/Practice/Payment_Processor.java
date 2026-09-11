package Practice;
import java.util.*;

class Payment {
    double amount;

    public double processPay(double amount) {
        return amount;
    }
}

class CreditCard extends Payment {
    @Override
    public double processPay(double amount) {
        return super.processPay(amount - (amount * 0.10));
    }
}

class UPI extends Payment {
    @Override
    public double processPay(double amount) {
        return super.processPay(amount - (amount * 0.05));
    }
}

class PayPal extends Payment {
    @Override
    public double processPay(double amount) {
        return super.processPay(amount - (amount * 0.15));
    }
}

public class Payment_Processor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Payment p1 = new Payment();

        System.out.print("Enter your balance: ");
        p1.amount = sc.nextDouble();
        System.out.println("1 - Credit Card");
        System.out.println("2 - UPI");
        System.out.println("3 - Paypal");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                CreditCard c1 = new CreditCard();
                System.out.println(c1.processPay(p1.amount));;
                break;

            case 2:
                UPI u1 = new UPI();
                System.out.println(u1.processPay(p1.amount));;
                break;

            case 3:
                PayPal p2 = new PayPal();
                System.out.println(p2.processPay(p1.amount));;
                break;
        
            default:
                System.out.println("Invalid input");
                break;
        }

        sc.close();
    }
}
