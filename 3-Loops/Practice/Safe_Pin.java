import java.util.*;

public class Safe_Pin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int correctPin = 3452;
        int i = 1;        

        while (i <= 3) {
            System.out.print("Enter the pin: ");
            int pin = sc.nextInt();

            if (correctPin == pin) {
                System.out.println("Access granted");
                break;
            }
            else {
                System.out.println("Try again");
            }
            i++;
        }

        sc.close();
    }
}
