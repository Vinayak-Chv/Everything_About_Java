package Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Search_Replace_Value {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Paris", "New York", "Tokyo", "New York", "Sweden", "New York"));

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("New York")) {
                list.set(i, "NYC");
            }
        }

        System.out.println(list);
    }
}
