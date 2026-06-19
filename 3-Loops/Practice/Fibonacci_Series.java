import java.util.*;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int first = 0, second = 1, next = 0;

        if (num == 1) {
            System.out.println("0");
        }
        else if (num == 2) {
            System.out.println("0 1");
        }
        else {
            System.out.printf("%d %d ", first, second);
            
            for (int i = 3; i <= num; i++) {
                next = first + second;
                System.out.printf("%d ", next);
                first = second;
                second = next;
            }
        }

        sc.close();
    }
}