import java.util.*;

public class Guess_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int secretNum = 45;
        int guessed = 0;

        while (true) {
            System.out.print("Guess the secret number: ");
            int guessNum = sc.nextInt();
            guessed = guessed + 1;

            if (guessNum == secretNum) {
                System.out.println("Correct!");
                break;
            }
            else if (guessNum > secretNum) {
                System.out.println("Too High");
            }
            else {
                System.out.println("Too Low");
            }   
        }
        System.out.printf("Total number of guesses: %d", guessed);
        
        sc.close();
    }
}
