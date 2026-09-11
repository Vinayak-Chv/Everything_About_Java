package Practice;

interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {
    static int tyres;
    String color;
    int price;

    public void start() {
        System.out.println("Car is starting");
    }

    public void stop() {
        System.out.println("Car has stopped");
    }

    Car(String color, int price) {
        this.color = color;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println(this.color);
        System.out.println(this.price);
    }

    public static int numberOfTyres() {
        return tyres = 4;
    }
}

class Drone implements Vehicle {
    static int fans;
    String color; 
    int price;

    public void start() {
        System.out.println("Drone is starting");
    }

    public void stop() {
        System.out.println("Drone has stopped");
    }

    Drone(String color, int price) {
        this.color = color;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println(this.color);
        System.out.println(this.price);
    }

    public static int numberOfFans() {
        return fans = 4;
    }
}

public class Mechanical_Devices {
    public static void main(String[] args) {
        Car c1 = new Car("black", 1124000);
        Drone d1 = new Drone("white", 10000);

        c1.displayInfo();
        d1.displayInfo();

        System.out.println(Car.numberOfTyres());
    }
}
