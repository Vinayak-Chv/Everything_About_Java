package Practice;

public class Row_Maximum {
    public static void main(String[] args) {
        int arr[][] = {
            {12, 45, 39},
            {56, 11, 89}
        };        

        for (int i = 0; i < arr.length; i++) {
            int maxNum = 0;

            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > maxNum) {
                    maxNum = arr[i][j];
                }
            }

            System.out.printf("Row: %d Max: %d\n", i, maxNum);
        }
    }
}
