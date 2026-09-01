public class Bit_Manipulation_Basics {
    public static void main(String[] args) {
        int n = 5;
        int position = 2;
        int bitmask = 1<<position;

        if ((bitmask & n) == 0) {
            System.out.println("Bit was zero");
        }
        else {
            System.out.println("Non zero");
        }
    }
}
