package Practice;

public class Grid_Sum {
    public static void main(String[] args) {
        int arr[][] = {
            {5, 4, 3},
            {7, 2, 9},
            {9, 6, 4}
        };
        int totalSum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                totalSum = totalSum + arr[i][j];
            }
        }

        System.out.printf("Total sum of whole grid is %d", totalSum);
    }
}
