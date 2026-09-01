package Practice;
import java.util.*;

public class Palindrome_Checker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String original = sc.next();
        StringBuilder sb = new StringBuilder(original).reverse();
        String reversed = sb.toString();

        if (original.equals(reversed)) {
            System.out.println("Palindrome number");
        }
        else {
            System.out.println("Not a palindrome number");
        }
        sc.close();
    }
}