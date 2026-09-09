// It's just a blue print or concept
// We can't make object instance of abstract class

abstract class Animal {
    // If we make any function in as an abstract function in that abstract class, that function should get called in that extended class and it is mandatory
    abstract void walk();

    Animal() {
        System.out.println("You are creating a new animal");
    }

    public void eat() {
        System.out.println("Animal eats");
    }
}

class Horse extends Animal {
    Horse() {
        System.out.println("You have created a horse");
    }

    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("Walks on 2 legs");
    } 
}

public class Abstraction {
    public static void main(String[] args) {
        Horse h1 = new Horse();

        h1.eat();
    }
}
