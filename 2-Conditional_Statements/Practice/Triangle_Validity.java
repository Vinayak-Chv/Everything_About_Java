import java.util.*;

public class Triangle_Validity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side 1: ");
        int a = sc.nextInt();

        System.out.print("Enter the side 2: ");
        int b = sc.nextInt();  

        System.out.print("Enter the side 3: ");
        int c = sc.nextInt();

        int sum = a + b + c;

        if (sum > 0 && sum == 180) {
            if (a == b && b == c) {
                System.out.println("Equilateral triangle");
            }
            else if (a == b || b == c || a == c) {
                System.out.println("Isosceles triangle");
            }
            else {
                System.out.println("Scalene triangle");
            }
        }
        else {
            System.out.println("Invalid Triangle");
        }

        sc.close();
    }
}
