import java.util.*;

public class Sum {
    
    public static int printSum(int a, int b) {
        int sum = 0;

        for (int i = a; i <= b; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter the ending number: ");
        int end = sc.nextInt();

        System.out.printf("The sum of all the numbers from %d to %d is %d", start, end, printSum(start, end));

        sc.close();
    }

}
