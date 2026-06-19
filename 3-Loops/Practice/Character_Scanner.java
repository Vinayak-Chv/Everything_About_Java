import java.util.*;

public class Character_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any word: ");
        String word = sc.next().toLowerCase();
        System.out.print("Enter the targeted alphabet of the word: ");
        char alphabet = sc.next().toLowerCase().charAt(0);
        int sum = 0;

        for (int i = 0; i <= word.length() - 1; i++) {
            if (word.charAt(i) == alphabet) {
                sum = sum + 1;
            }
        }

        System.out.println(sum);
        
        sc.close();
    }
}
