package Practice;

public class Grid_Value_Multiplier {
    public static void main(String[] args) {
        int arr[][] = {
            {1, 2},
            {3, 4}
        };
        int factor = 3;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] *= factor;

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
