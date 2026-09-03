package Practice;

public class Lights {
    public static void main(String[] args) {
        int lights = 0b10101010;
        int bitMask = 1<<3;

        System.out.println(((bitMask & lights) == 0 ? "OFF" : "ON"));
    }
}
