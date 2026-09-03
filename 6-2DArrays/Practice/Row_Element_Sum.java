package Practice;

public class Row_Element_Sum {
    public static void main(String[] args) {
        int arr[][] = {
            {10, 20, 30},
            {5, 5, 5}
        };

        for (int i = 0; i < arr.length; i++) {
            int rowSum = 0;

            for (int j = 0; j < arr[i].length; j++) {
                rowSum = rowSum + arr[i][j];
            }

            System.out.println(rowSum);
        }
    }
}
