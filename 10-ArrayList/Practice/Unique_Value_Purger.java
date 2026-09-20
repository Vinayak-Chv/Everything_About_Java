package Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Unique_Value_Purger {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4, 3, 2, 7, 8, 2, 3, 1));
        var uniqueList = new ArrayList<Integer>();

        for (int i = 0; i < list.size(); i++) {
            if (uniqueList.contains(list.get(i)) == false) {
                uniqueList.add(list.get(i));
            }
            else {
                continue;
            }
        }
        
        System.out.println(uniqueList);
    }
}
