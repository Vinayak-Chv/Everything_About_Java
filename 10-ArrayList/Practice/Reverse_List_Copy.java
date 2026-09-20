package Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Reverse_List_Copy {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Home", "Products", "Checkout"));
        ArrayList<String> reversedList = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {     
            reversedList.add(list.get(i));
        }

        System.out.println(reversedList);
    }
}
