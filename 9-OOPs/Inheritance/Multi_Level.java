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

class EquilateralTriangle extends Triangle {
    public void area(int l, int h) {
        System.out.println(1/2 * l * h);
    }
}

public class Multi_Level {
    public static void main(String[] args) {
        EquilateralTriangle t1 = new EquilateralTriangle();
        
        t1.area(2, 2);
    }
}
