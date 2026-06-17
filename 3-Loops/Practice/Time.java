import java.util.*;

public class Time {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        for (int i = num; i >= 1; i--) {
            System.out.println(i);

            if (num < 10) {
                Thread.sleep(1500);
            }
            else {
                Thread.sleep(500);
            }
        }

        System.out.println("Blast off!!!");

        sc.close();
    }
}
