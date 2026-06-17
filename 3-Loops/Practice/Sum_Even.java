import java.util.*;

public class Sum_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        } 

        System.out.printf("Sum: %d", sum);
        sc.close();
    }
}
