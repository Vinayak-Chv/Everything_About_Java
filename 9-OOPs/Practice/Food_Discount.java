package Practice;

interface Discount {
    double calculateDiscount(double originalPrice);
}

class StudentDiscount implements Discount {
    @Override 
    public double calculateDiscount(double originalPrice) {
        return originalPrice - (originalPrice * 0.10);
    }
}

class FestivalDiscount implements Discount {
    @Override 
    public double calculateDiscount(double originalPrice) {
        return originalPrice - (originalPrice * 0.50);
    }
}

class PremiumMemberDiscount implements Discount {
    @Override 
    public double calculateDiscount(double originalPrice) {
        return originalPrice - (originalPrice * 0.20);
    }
}

public class Food_Discount {
    public static void main(String[] args) {
        Discount d = new PremiumMemberDiscount();

        System.out.println(d.calculateDiscount(1000));
    }
}
