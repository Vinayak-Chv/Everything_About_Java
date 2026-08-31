package Practice;

public class Cols_Element_Sum {
    public static void main(String[] args) {
        int arr[][] = {
            {5, 2, 1},
            {10, 3, 4},
            {2, 1, 0}
        };
        
        for (int j = 0; j < arr.length; j++) {
            int colSum = 0;

            for (int i = 0; i < arr[j].length; i++) {
                colSum += arr[i][j];
            }

            System.out.println(colSum);
        }
    }
}
