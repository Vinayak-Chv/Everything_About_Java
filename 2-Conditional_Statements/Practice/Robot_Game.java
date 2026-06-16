import java.util.*;

public class Robot_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the direction: ");
        String dir = sc.next().toUpperCase();

        System.out.print("Enter the command: ");
        String cmd = sc.next().toLowerCase();

        switch (dir) {
            case "N":
                if (cmd.equals("left")) {
                    System.out.println("Heading towards the west");
                }
                else if (cmd.equals("right")) {
                    System.out.println("Heading towards east");
                }
                break;

            case "W":
                if (cmd.equals("left")) {
                    System.out.println("Heading towards the south");
                }
                else if (cmd.equals("right")) {
                    System.out.println("Heading towards north");
                }
                break;

            case "S":
                if (cmd.equals("left")) {
                    System.out.println("Heading towards the east");
                }
                else if (cmd.equals("right")) {
                    System.out.println("Heading towards west");
                }
                break;

            case "E":
                if (cmd.equals("left")) {
                    System.out.println("Heading towards the north");
                }
                else if (cmd.equals("right")) {
                    System.out.println("Heading towards south");
                }
                break;
        
            default:
                System.out.println("Invalid input");
                break;
        }

        sc.close();
    }
}
