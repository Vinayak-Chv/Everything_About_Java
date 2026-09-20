package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Duplicate_Name_Detector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>(Arrays.asList("test@mail.com", "user@mail.com"));

        System.out.print("Enter your login credentials: ");
        String login = sc.nextLine();

        if (list.contains(login)) {
            System.out.println("Access denied: already subscribed");
        }
        else {
            System.out.println("Access granted");
            list.add(login);
            System.out.println(list);
        }

        sc.close();
    }
}
