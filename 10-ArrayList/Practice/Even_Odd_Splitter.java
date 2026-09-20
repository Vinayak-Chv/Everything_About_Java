package Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Even_Odd_Splitter {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        ArrayList<Integer> evenNum = new ArrayList<>(), oddNum = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                evenNum.add(list.get(i));
            }
            else {
                oddNum.add(list.get(i));
            }
        }

        System.out.printf("Even numbers: %s\nOdd numbers: %s", evenNum, oddNum);
    }
}
