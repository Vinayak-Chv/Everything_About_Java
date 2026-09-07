package Practice;

public class Element_Multiplier {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int factor = 5;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * factor;
        }

        for (int i : arr) {
            System.out.printf("%d ", i);
        }
    }
}
