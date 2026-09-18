import java.util.*;

class Basics_ArrayList {
    public static void main(String[] args) {
        // Initialization - In place of Integer you can write String, Boolean
        ArrayList<Integer> list = new ArrayList<>();

        // Add elements
        list.add(0);
        list.add(2);
        list.add(3);

        System.out.println(list);

        // Get elements
        int element = list.get(0);
        System.out.println(element);

        // Add element in between
        list.add(1, 1);
        System.out.println(list);

        // Set element - change the value in any indexed position
        list.set(0, 5);
        System.out.println(list);

        // Delete element
        list.remove(3);
        System.out.println(list);

        // Size of the arraylist
        System.out.println(list.size());

        // Sort the element in ascending order
        Collections.sort(list);
        System.out.println(list);
    }    
}