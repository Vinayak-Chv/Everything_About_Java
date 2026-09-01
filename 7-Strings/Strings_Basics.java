import java.util.*;

public class Strings_Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.printf("Your name is %s", name);

        sc.close();
    }
}
