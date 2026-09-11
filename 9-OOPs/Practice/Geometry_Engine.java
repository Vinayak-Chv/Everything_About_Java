package Practice;

class Shape {
    public void area(int side) {
        System.out.println(side * side);
    }

    public void area(int length, int breadth) {
        System.out.println(length * breadth);
    }
}

public class Geometry_Engine {
    public static void main(String[] args) {
        Shape s1 = new Shape();

        s1.area(2);
        s1.area(4, 7);
    }
}
