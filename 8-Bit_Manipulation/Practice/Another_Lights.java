package Practice;

public class Another_Lights {
    public static void main(String[] args) {
        int bit = 0b11001100;

        // Step 1
        System.out.println((bit & (1 << 4)) == 0 ? "OFF" : "ON");

        // Step 2
        int newNumber = bit | 1 << 1;
        System.out.println(Integer.toBinaryString(newNumber));

        // Step 3
        int newNumber1 = newNumber & ~(1 << 6);
        System.out.println(Integer.toBinaryString(newNumber1));

        // Step 4
        int newNumber2 = newNumber1 ^ 1 << 7;
        System.out.println(Integer.toBinaryString(newNumber2));

        System.out.println(newNumber2);
    }
}
