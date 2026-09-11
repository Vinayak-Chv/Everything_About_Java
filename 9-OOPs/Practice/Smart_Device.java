package Practice;

class Device {
    String brand;
    int price;

    Device(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }
}

class SmartPhones extends Device {
    String os;

    SmartPhones(String brand, int price, String os) {
        super(brand, price);
        this.os = os;
    }

    public void displayInfo() {
        System.out.println(this.brand);
        System.out.println(this.price);
        System.out.println(this.os);
    }
}

public class Smart_Device {
    public static void main(String[] args) {
        SmartPhones p1 = new SmartPhones("Samsung Galaxy S24", 60000, "Linux");
        p1.displayInfo();
    }
}
