package Practice;
import java.util.*;

public class Specific_Bit_Fetcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.print("Enter the position: ");
        int pos = sc.nextInt();

        int bitMask = 1 << pos;

        System.out.println(((bitMask & num) == 0) ? "0" : "1");

        sc.close();
    }
}
