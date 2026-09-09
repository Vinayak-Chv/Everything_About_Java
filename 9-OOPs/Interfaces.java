// We can't make constructors
// By default the functions are abstract and public in interface

interface Animal {
    void walk();
}

interface Herbivore {

}

class Horse implements Animal, Herbivore {
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        
    }
}
