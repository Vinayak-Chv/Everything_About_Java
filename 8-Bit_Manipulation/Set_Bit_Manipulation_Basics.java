// This operation is use to make the value 1 whether it is 0 or 1.

public class Set_Bit_Manipulation_Basics {
    public static void main(String[] args) {
        int n = 5;
        int position = 1;
        int bitMask = 1<<position;

        int newNumber = bitMask | n;
        System.out.println(newNumber);
    }
}
