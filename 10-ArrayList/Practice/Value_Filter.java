package Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Value_Filter {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(12, 5, 8, 21, 14, 9));

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }
        }
        
        System.out.println(list);
    }
}
