import java.util.*;

public class String_Concatination {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String fname = sc.next();

        System.out.print("Enter your middle name: ");
        String mname = sc.next();

        System.out.print("Enter your last name: ");
        String lname = sc.next();

        String fullName = fname + " " + mname + " " + lname;

        System.out.printf("Full Name: %s\n", fullName);
        System.out.printf("Length of the string: %s\n", fullName.length());

        System.out.println("Each letter");
        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
            Thread.sleep(500);
        }

        sc.close();
    }
}
