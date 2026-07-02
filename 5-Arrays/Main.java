public class Main {
    public static void main(String[] args) {
        // int[] marks = new int[3];
        // int marks[] = new int[3];
        int marks[] = {98, 87, 89};
        marks[0] = 97;
        marks[1] = 92;
        marks[2] = 95;

        for (int i = 0; i <= 2; i++) {
            System.out.println(marks[i]);
        }
    }    
}
