package Practice;
import java.util.*;

public class Indices_Finder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of colums: ");
        int cols = sc.nextInt();
        System.out.print("Enter the target: ");
        int target = sc.nextInt();

        int arr[][] = new int[rows][cols];

        System.out.println("Enter your Data");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Data");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == target) {
                    System.out.printf("%d is the target and the indices are (%d * %d)", target, i, j);
                }
            }
            System.out.println();
        }


        sc.close();
    }    
}
