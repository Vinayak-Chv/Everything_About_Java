import java.util.*;

public class Temperature_Converter {
    
    public static double tempConverter(double cel) {
        return (cel * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your temperature in celsius: ");
        double temp = sc.nextDouble();

        System.out.printf("You're temperature in Fahrenheit is %.2f", tempConverter(temp));

        sc.close();
    }

}
