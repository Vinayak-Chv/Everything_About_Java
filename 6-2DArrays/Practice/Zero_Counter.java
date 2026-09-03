package Practice;

public class Zero_Counter {
    public static void main(String[] args) {
        int arr[][] = {
            {1, 0, 3},
            {0, 5, 0}
        };
        int zeroCount = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    zeroCount++;
                }
            }
        }

        System.out.println(zeroCount);
    }
}
