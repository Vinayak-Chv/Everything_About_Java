import java.util.*;

public class String_Length {
    
    public static boolean printStringLimit(String a, int b) {
        if (a.length() <= b) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.next().toLowerCase();
        System.out.print("Enter the limit of string: ");
        int limit = sc.nextInt();

        if (printStringLimit(word, limit) == true) {
            System.out.println("Match");
        }
        else {
            System.out.println("Not match");
        }

        sc.close();
    }

}
