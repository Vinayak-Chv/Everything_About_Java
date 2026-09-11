package Practice;

class Employee {
    String name;
    int empId;

    Employee(String name) {
        this.name = name;
        this.empId = -1;
    }

    Employee(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    public void printEmpInfo() {
        System.out.println(this.name);
        System.out.println(this.empId);
    }
}

public class Employee_ID {
    public static void main(String[] args) {
        Employee e1 = new Employee("Luffy");
        Employee e2 = new Employee("Zoro", 101);

        e1.printEmpInfo();
        e2.printEmpInfo();
    }
}
