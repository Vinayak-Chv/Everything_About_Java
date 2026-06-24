import java.util.*;

public class Square {
    
    public static int printSquare(int a) {
        return a * a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.printf("Square of %d is %d", num, printSquare(num));

        sc.close();
    }

}
