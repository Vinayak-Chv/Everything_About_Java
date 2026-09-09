class Student {
    String name;
    int age;

    // Same function name use for different purpose (Overloading)
    // If parameters are same then return type should be different and vice versa
    // And different types of arguments is also acceptable
    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name);
        System.out.println(age);
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Student s1 = new Student("Luffy", 18);
        
        // Only name
        s1.printInfo(s1.name);

        // Name + age
        s1.printInfo(s1.name, s1.age);
    }
}
