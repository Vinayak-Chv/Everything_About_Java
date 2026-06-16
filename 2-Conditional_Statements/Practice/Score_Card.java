import java.util.*;

public class Score_Card {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your score: ");
        int score = sc.nextInt();

        if (score > 0 && score < 100) {
            if (score >= 90) {
                System.out.println("Excellent");
            }
            else if (score >= 75 && score <= 89) {
                System.out.println("Good");
            }
            else if (score >= 50 && score <= 74) {
                System.out.println("Pass");
            }
            else {
                System.out.println("Fail");
            }
        }
        else {
            System.out.println("Marks should be between 0 - 100");
        }

        sc.close();
    }
}
