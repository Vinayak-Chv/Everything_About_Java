import java.util.*;

public class Main {
    public static void main(String[] args) {
        //output
        System.out.println("Hello world");

        System.out.println("*\n**\n***\n****");

        //variables
        int age = 21;
        double pi = 3.14;
        String name = "Al Pacino";

        System.out.println("This is " + name + " and my age is " + age + ". Cool thing is that I know the value of Pi:" + pi);

        //Taking input
        Scanner sc = new Scanner(System.in);
        String firstWord = sc.next();
        String wholeLine = sc.nextLine();

        System.out.println(firstWord);
        System.out.println(wholeLine);

        sc.close();
    }
}
