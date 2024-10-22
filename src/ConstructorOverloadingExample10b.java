class Employee {
    private String name;
    private int id;
    private String department;

    // Constructor 1: with name and ID
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
        this.department = "Unknown";
    }

    // Constructor 2: with name, ID, and department
    public Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    public void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Department: " + department);
    }
}

public class ConstructorOverloadingExample10b {
    public static void main(String[] args) {
        // Using first constructor
        Employee emp1 = new Employee("Alice", 123);
        emp1.display();

        System.out.println();

        // Using second constructor
        Employee emp2 = new Employee("Bob", 456, "Engineering");
        emp2.display();
    }
}
