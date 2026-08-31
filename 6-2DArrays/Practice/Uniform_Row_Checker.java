package Practice;

public class Uniform_Row_Checker {
    public static void main(String[] args) {
        int arr[][] = {
            {5, 2, 5},
            {5, 5, 5}
        };

        for (int i = 0; i < arr.length; i++) {
            boolean isUniform = true;
            int base = arr[i][0];
            
            for (int j = 1; j < arr[i].length; j++) {
                if (base != arr[i][j]) {
                    isUniform = false;
                    break;
                }
            }

            if (isUniform == true) {
                System.out.printf("Row %d is uniform", i);
            }
        }
    }
}
