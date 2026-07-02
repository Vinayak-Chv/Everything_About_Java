import java.util.*;

public class Element_Searcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {101, 204, 305, 408};
        System.out.print("Enter the element: ");
        int num = sc.nextInt();
        boolean isFound = false;

        for (int i = 0; i <= arr.length - 1; i++) {
            if (num == arr[i]) {
                isFound = true;
                break;
            }
        }

        if (isFound == true) {
            System.out.println("Found");
        }
        else {
            System.out.println("Not found");
        }

        sc.close();
    }
}