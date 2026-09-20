package Practice;

import java.util.*;

class Task_Elimination {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Buy Groceries", "Clean Room", "Study Java"));

        while (!list.isEmpty()) {
            System.out.println(list);
            list.remove(0);
            Thread.sleep(1000);
        }

        System.out.println("Everything is done!");
    }    
}