package Practice;

public class Even_Odd_Bit_Detector {
    public static void main(String[] args) {
        int num = 26;
        System.out.println((num & 1 << 0) == 0 ? "Even number" : "Odd number");
    }
}
