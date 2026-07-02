public class Second_Num {
    public static void main(String[] args) {
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        int scores[] = {12, 35, 1, 10, 34, 1};

        for (int score : scores) {
            if (score > largest) {
                secondLargest = largest;
                largest = score;
            }
            else if (score > secondLargest && score != largest) {
                secondLargest = score;
            }
        }

        System.out.printf("The second largest number is %d", secondLargest);
    }    
}
