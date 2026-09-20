package Practice;

import java.util.ArrayList;

public class Score_Overwriter {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(150);
        list.add(200);
        list.add(180);
        list.add(220);

        System.out.printf("Before updating: %s\n", list);
        list.set(2, 195);
        System.out.printf("After updating: %s", list);
    }
}
