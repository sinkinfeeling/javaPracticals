import java.util.Scanner;

public class Quadratic5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input coefficients a, b, and c from the user
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        // Calculate the discriminant (b^2 - 4ac)
        double discriminant = (b * b) - (4 * a * c);

        // Check if the discriminant is positive, zero, or negative
        if (discriminant > 0) {
            // Two real solutions
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The equation has two real solutions:");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (discriminant == 0) {
            // One real solution
            double root = -b / (2 * a);
            System.out.println("The equation has one real solution:");
            System.out.println("Root: " + root);
        } else {
            // No real solutions
            System.out.println("The equation has no real solutions because the discriminant is negative.");
        }

        scanner.close();
    }
}
