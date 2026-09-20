package Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Target_Frequency_Counter {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 5, 3, 4, 5, 6, 7, 9, 5));
        int count = 0, target = 5;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == target) {
                count++;
            }
        }

        System.out.printf("Count: %d", count);
    }
}
