// This operation is used to make the value 0. Opposite of set operation

public class Clear_Bit_Manipulation_Basics {
    public static void main(String[] args) {
        int n = 5;
        int position = 2;
        int bitMask = 1<<position;
        int notBitMask = ~(bitMask);

        int newNumber = notBitMask & n;
        System.out.println(newNumber);
    }
}
