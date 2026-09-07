package Practice;

public class Two_Inspector_Power {
    public static void main(String[] args) {
        int num = 16;
        boolean result = false;

        if (num <= 0) {
            result = false;
        }
        else if ((num & (num - 1)) == 0) {
            result = true;
        }

        System.out.println(result);
    }
}
