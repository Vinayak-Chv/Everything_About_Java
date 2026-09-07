package Practice;
import java.util.Arrays;

public class Element_Shifter {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40};
        int temp = arr[0];

        for (int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }

        arr[arr.length - 1] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
