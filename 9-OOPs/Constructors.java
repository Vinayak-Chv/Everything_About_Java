class Student {
    String name; 
    int age;

    // Parameterized constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

class Car {
    String name;
    String model;

    // Non-parameterized constructor
    Car() {
        System.out.println("Constructor called (Non-parameterized constructor), always called");
    }

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.model);
    }

    // Copy constructors (Always user-defined)
    Car(Car c1) {
        this.name = c1.name;
        this.model = c1.model;
    }
}

public class Constructors {
    public static void main(String[] args) {
        Student s1 = new Student("Vinayak", 21);
        s1.printInfo();

        System.out.println();

        Car c1 = new Car();
        System.out.println("Car Part: ");

        c1.name = "Nissan";
        c1.model = "GTR";

        c1.printInfo();

        System.out.println("Car 2 info: ");
        Car c2 = new Car(c1);
        c2.printInfo();

        
    }
}
