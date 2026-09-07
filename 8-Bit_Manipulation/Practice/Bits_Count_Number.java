package Practice;

public class Bits_Count_Number {
    public static void main(String[] args) {
        int num = 11, count = 0;

        while (num > 0) {
            if ((num & 1) == 1) {
                count++;
            }
            num = num >> 1;
        }

        System.out.printf("Count of 1s is %d", count);
    }
}