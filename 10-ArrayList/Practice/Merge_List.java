package Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Merge_List {
    public static void main(String[] args) {
        ArrayList<Integer> combinedList = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(1, 3, 5));
        ArrayList<Integer> l2 = new ArrayList<>(Arrays.asList(2, 4, 6));

        for (int i = 0; i < l1.size(); i++) {
            int firstList = l1.get(i);
            int secondList = l2.get(i);

            combinedList.add(firstList);
            combinedList.add(secondList);
        }

        System.out.println(combinedList);
    }
}
