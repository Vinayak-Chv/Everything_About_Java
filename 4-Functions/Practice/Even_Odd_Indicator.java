import java.util.*;

public class Even_Odd_Indicator {
    
    public static boolean printScore(int a) {
        boolean isEven = false;

        if (a % 2 == 0) {
            isEven = true;
        }

        return isEven;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your score: ");
        int score = sc.nextInt();

        if (printScore(score) == true) {
            System.out.println("Even number");
        }
        else {
            System.out.println("Odd number");
        }

        sc.close();
    }

}
