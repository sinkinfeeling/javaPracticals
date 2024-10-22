import java.util.Scanner;

// Employee class to hold employee details
class Employee {
    private String name;
    private int id;
    private String department;
    private double salary;

    // Constructor to initialize employee details
    public Employee(String name, int id, String department, double salary) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}

// Main class to interact with the user and display employee details
public class Employee4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input employee details
        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consume the newline

        System.out.print("Enter Employee Department: ");
        String department = scanner.nextLine();

        System.out.print("Enter Employee Salary: ");
        double salary = scanner.nextDouble();

        // Create an Employee object with the provided details
        Employee employee = new Employee(name, id, department, salary);

        // Display the employee details
        employee.displayDetails();

        // Close the scanner
        scanner.close();
    }
}
