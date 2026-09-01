package Practice;

public class Even_Number_Grid_Filter {
    public static void main(String[] args) {
        int arr[][] = {
            {1, 2, 3},
            {4, 5, 6}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 != 0) {
                    arr[i][j] = 0;
                }

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
