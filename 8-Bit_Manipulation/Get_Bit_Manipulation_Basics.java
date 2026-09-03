// This operation is to check whether the value is 0 or 1.

public class Get_Bit_Manipulation_Basics {
    public static void main(String[] args) {
        int n = 5;
        int position = 2;
        int bitMask = 1<<position;

        if ((bitMask & n) == 0) {
            System.out.println("Bit was zero");
        }
        else {
            System.out.println("Non zero");
        }
    }
}
