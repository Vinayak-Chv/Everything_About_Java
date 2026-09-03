// This operation used to change the bit from 0 to 1 and 1 to 0.
import java.util.*;

public class Update_Bit_Manipulation_Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a bit(0/1): ");
        int operation = sc.nextInt();
        int n = 5;
        int position = 1;
        int bitMask = 1<<position;

        if (operation == 1) {
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }
        else {
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }

        sc.close();
    }
}
