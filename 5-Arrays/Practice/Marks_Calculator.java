import java.util.*;

public class Marks_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks[] = new int[4];
        int sum = 0;

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter you're marks: ");
            marks[i] = sc.nextInt();
        }

        for (int mark : marks) {
            sum += mark;
        }

        System.out.printf("Sum: %d\nAverage: %d", sum, sum / 4);

        sc.close();
    }
}