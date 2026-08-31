package Practice;

public class Grid_Element_Counter {
    public static void main(String[] args) {
        int arr[][] = {
            {1, 0, 1},
            {0, 1, 1}
        };
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1) {
                    count++;
                }
            }
        }

        System.out.printf("Students present: %d", count);
    }
}
