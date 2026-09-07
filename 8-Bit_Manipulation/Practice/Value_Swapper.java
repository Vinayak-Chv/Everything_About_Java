package Practice;

public class Value_Swapper {
    public static void main(String[] args) {
        int num1 = 9, num2 = 5;

        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;

        System.out.println(num1 + " " + num2);
    }
}
