import java.util.*;

public class Digit_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            sum = sum + lastDigit;
            num = num / 10;
        }

        System.out.println(sum);

        sc.close();
    }
}