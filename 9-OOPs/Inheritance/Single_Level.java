package Inheritance;

// Base class
class Shape {
    String color;

    public void area() {
        System.out.println("Displays area");
    }
}

// Derived class
class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(1/2 * l * h);
    }
}

public class Single_Level {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        
        t1.area(2, 2);
    }
}
