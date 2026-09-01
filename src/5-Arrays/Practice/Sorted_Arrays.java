public class Sorted_Arrays {
    public static void main(String[] args) {
        int arr[] = {5, 12, 99, 18, 25};
        boolean isSorted = true;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted == true) {
            System.out.println("Sorted");
        }
        else {
            System.out.println("Not sorted");
        }
    }
}