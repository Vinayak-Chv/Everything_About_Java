public class Count_Element_Occurance {
    public static void main(String[] args) {
        int arr[] = {4, 2, 4, 1, 4, 3, 2};
        int target = 9, count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
            else {
                System.out.println("Invalid input");
                break;
            }
        }

        if (count > 0) {
            System.out.printf("Count: %d", count);
        }
    }
}
