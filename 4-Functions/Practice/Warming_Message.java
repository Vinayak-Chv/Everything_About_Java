import java.util.*;

public class Warming_Message {
    
    public static void printMessage(String a, int b) throws InterruptedException {
        int i = 1;

        while (i <= b) {
            System.out.println(a);
            Thread.sleep(1000);
            i++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any message: ");
        String msg = sc.next().toLowerCase();
        System.out.print("Number of times message should print: ");
        int num = sc.nextInt();

        printMessage(msg, num);

        sc.close();
    }

}
