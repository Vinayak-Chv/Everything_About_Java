package Practice;
import java.util.*;

public class Email_Domain_Extractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your mail: ");
        String gmail = sc.next();
        String result = "";

        for (int i = 0; i < gmail.length(); i++) {
            int index = gmail.indexOf("@");
            result = gmail.substring(index += 1, gmail.length());
        }

        System.out.println(result);

        sc.close();
    }
}
