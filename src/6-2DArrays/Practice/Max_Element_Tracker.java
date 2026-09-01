package Practice;

public class Max_Element_Tracker {
    public static void main(String[] args) {
        int arr[][] = {
            {12, 35, 21},
            {40, 18, 33}
        };
        int maxVal = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > maxVal) {
                    maxVal = arr[i][j];
                }
            }
        }

        System.out.println(maxVal);
    }
}
