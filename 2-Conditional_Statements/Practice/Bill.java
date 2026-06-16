import java.util.*;

public class Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the consumption units: ");
        int units = sc.nextInt();

        int slab1 = Math.min(units, 100) * 5;
        int slab2 = Math.max(0, Math.min(units, 300) - 100) * 7;
        int slab3 = Math.max(0, units - 300) * 10;
        int total = slab1 + slab2 + slab3;

        System.out.printf("Total bill: %d", total);

        sc.close();
    }
}
