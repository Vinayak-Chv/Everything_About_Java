package Inheritance;

class Shape {
    String color;
}

class Triangle extends Shape {

}

public class Basic_Inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "red";
    }
}
