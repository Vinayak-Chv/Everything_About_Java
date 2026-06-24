import java.util.*;

public class Character_Counter {

    public static int countCharacter(String a, char b) {

        int sum = 0;

        if (a.equals("")) {
            System.out.println("Invalid input");
        }
        else {
            for (int i = 0; i <= a.length() - 1; i++) {
                if (a.charAt(i) == b) {
                    sum = sum + 1;
                }
            }
        }

        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.next().toLowerCase();
        System.out.print("Enter a word: ");
        char alphabet = sc.next().toLowerCase().charAt(0);

        System.out.printf("You're is %s and targeted alphabet is %s and the count is %d", word, alphabet, countCharacter(word, alphabet));

        sc.close();
    }

}
