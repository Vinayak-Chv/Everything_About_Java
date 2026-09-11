package Practice;
import java.util.*;

class Guard {
    private int temp;

    public int getTemp() {
        return this.temp;
    }

    public void setTemp(int tem) {
        this.temp = tem;
        
        if (tem >= 16 && tem <= 32) {
            System.out.println("Everything is good!");
        }
        else {
            System.out.println("Warning!!");
        }
    }
}

public class Smart_Thermostat_Guard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Guard g1 = new Guard();

        System.out.print("Enter your temperature: ");
        g1.setTemp(sc.nextInt());
        g1.getTemp();

        sc.close();
    }    
}