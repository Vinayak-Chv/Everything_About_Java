package Practice;
import java.util.*;

public class Case_Shifter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.next().toLowerCase();

        System.out.printf("Normal case: %s\nShifted Case: %s", word, word.toUpperCase());

        sc.close();
    }
}
