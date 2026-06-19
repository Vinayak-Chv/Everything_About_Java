import java.util.*;

public class Binary_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        String binary = "";

        while (num > 0) {
            int remainder = num % 2;
            binary = remainder + binary;
            num = num / 2;
        }

        System.out.printf("Binary conversation of base 10 is %s", binary);

        sc.close();
    }
}