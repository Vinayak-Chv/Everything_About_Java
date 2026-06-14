import java.util.*;

// Use .equals when comparing 2 values in the string (Non-primitive data types)
// Use == to check whether the memory location is same or not for numericals (Primitive data types)

public class Rock_Paper_Scissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Rock Paper and Scissors game");

        System.out.print("Enter the First Choice: ");
        String p1 = sc.nextLine().toLowerCase();

        System.out.print("Enter the Second Choice: ");
        String p2 = sc.nextLine().toLowerCase();

        if (p1.equals(p2)) {
            System.out.println("Tie");
        }

        else if ((p1.equals("rock") && p2.equals("scissors")) || (p1.equals("paper") && p2.equals("rock")) || (p1.equals("scissors") && p2.equals("paper"))) { 
            System.out.println("Player 1 wins");
        }

        else if ((p2.equals("rock") && p1.equals("scissors")) || (p2.equals("paper") && p1.equals("rock")) || (p2.equals("scissors") && p1.equals("paper"))) { 
            System.out.println("Player 2 wins");
        }
        
        else {
            System.out.println("Invalid input");
        }

        sc.close();
    }
}
