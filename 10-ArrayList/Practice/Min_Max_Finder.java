package Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Min_Max_Finder {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(320, 200, 450, 900, 750));

        if (!list.isEmpty()) {
            int min = list.get(0), max = list.get(0);

            for (int i = 1; i < list.size(); i++) {
                if (list.get(i) > max) {
                    max = list.get(i);
                }
                if (list.get(i) < min) {
                    min = list.get(i);
                }
            }

            System.out.printf("Minimum score: %d\nMaximum score: %d", min, max);
        }
    }
}
