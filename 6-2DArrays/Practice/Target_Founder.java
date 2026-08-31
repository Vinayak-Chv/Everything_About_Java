package Practice;

public class Target_Founder {
    public static void main(String[] args) {
        int arr[][] = {
            {14, 25, 36},
            {48, 77, 91}
        };
        int target = 91;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (target == arr[i][j]) {
                    System.out.printf("Found in %dx%d", i, j);
                }
            }
        }
    }
}
