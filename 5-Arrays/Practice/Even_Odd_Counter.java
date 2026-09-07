package Practice;

public class Even_Odd_Counter {
    public static void main(String[] args) {
        int arr[] = {12, 8, 92, 47, 8, 19};
        int evenCount = 0, oddCount = 0;
        int insertPos = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[insertPos] % 2 == 0) {
                evenCount++;
                insertPos++;
            }
            else {
                oddCount++;
                insertPos++;
            }
        }

        System.out.printf("Even counts: %d\nOdd counts: %d", evenCount, oddCount);
    }
}
