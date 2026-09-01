package Practice;

public class Anti_Diagonal_Finder {
    public static void main(String[] args) {
        int arr[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            int col = (arr.length - 1) - i;
            sum += arr[i][col];
        }

        System.out.println(sum);
    }
}
