import java.util.*;

public class Traffic_Lights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter traffic light colors: ");
        String color = sc.next();

        switch (color.toLowerCase()) {
            case "red":
                System.out.println("Stop");
                break;
        
            case "yellow":
                System.out.println("Prepare");
                break;

            case "green":
                System.out.println("Go");
                break;

            default:
                System.out.println("Invalid input");
                break;
        }

        sc.close();
    }
}
