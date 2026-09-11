package Practice;

abstract class Appliance {
    String name;
    int powerState;

    Appliance(String name, int powerState) {
        this.name = name;
        this.powerState = powerState;
    }

    abstract void echoMode();
}

class Fridge extends Appliance {
    Fridge(String name, int powerState) {
        super(name, powerState);
    }

    public void echoMode() {
        System.out.println("Fridge is cooling down...");
    }
}

class LightBulb extends Appliance {
    LightBulb(String name, int powerState) {
        super(name, powerState);
    }

    public void echoMode() {
        System.out.println("Lightbulb is cooling down...");
    }
}

public class Appliance_Power_Management {
    public static void main(String[] args) {
        Fridge f1 = new Fridge("Wrilpool", 20);
        LightBulb l1 = new LightBulb("Orient", 5);

        f1.echoMode();
        l1.echoMode();
    }
}
