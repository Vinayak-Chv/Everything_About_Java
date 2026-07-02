import java.util.*;

public class Sum_Avg_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int steps[] = {5000, 7000, 8000, 4000, 6000};
        int sum = 0, avg = 0;

        for (int i = 0; i <= steps.length - 1; i++) {
            sum = steps[i] + sum;
            avg = sum / steps.length;
        }

        System.out.printf("Sum: %d\nAverage: %d", sum, avg);

        sc.close();
    }
}
