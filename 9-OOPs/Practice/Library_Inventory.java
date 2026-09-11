package Practice;

class Asset {
    String title;

    Asset(String title) {
        this.title = title;
    }

    public int getCheckoutDuration() {
        return 7;
    }
}

class ReferenceTextbook extends Asset {

    ReferenceTextbook(String title) {
        super(title);
    }

    @Override 
    public int getCheckoutDuration() {
        return 14;
    }
}

class DigitalMedia extends Asset {

    DigitalMedia(String title) {
        super(title);
    }

    @Override 
    public int getCheckoutDuration() {
        return 3;
    }
}

public class Library_Inventory {
    public static void main(String[] args) {
        ReferenceTextbook r1 = new ReferenceTextbook("Tokyo ghoul");
        DigitalMedia d1 = new DigitalMedia("Vagabond");

        System.out.printf("Book Name: %s and Checkout duration: %d\n", r1.title, r1.getCheckoutDuration());
        System.out.printf("Book Name: %s and Checkout duration: %d", d1.title, d1.getCheckoutDuration());
        
    }
}
