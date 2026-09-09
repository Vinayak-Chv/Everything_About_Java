// If we use Static keyword in java so that value would be same or common
// We can use access it easy cuz main class and school variable is also static

class Student {
    String name;
    static String school;

    public static void changeSchool() {
        school = "newSchool";
    }
}

public class Static_Keyword {
    public static void main(String[] args) {
        Student.school = "JMV";
        Student s1 = new Student();
        s1.name = "Luffy";
    }
}
