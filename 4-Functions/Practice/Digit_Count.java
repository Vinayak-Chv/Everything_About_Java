import java.util.*;

public class Digit_Count {

    public static int printCount(int a) {
        int count = 0;

        while (a > 0) {
            a = a / 10;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.printf("The Id number is %d and the count is %d", num, printCount(num));

        sc.close();
    }
    
}