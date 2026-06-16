import java.util.*;

public class WeekDay_Finder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number(1 - 7): ");
        int day = sc.nextInt();

        switch (day) {
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("Weekdays");
                break;
        
            case 6: case 7:
                System.out.println("Weekends");
                break;
            
            default:
                System.out.println("Invalid input");
                break;
        }

        sc.close();
    }
}
