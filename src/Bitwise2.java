import java.util.Scanner;

public class Bitwise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two integers from the user
        System.out.print("Enter the first integer (a): ");
        int a = scanner.nextInt();
        
        System.out.print("Enter the second integer (b): ");
        int b = scanner.nextInt();

        // Arithmetic Operations
        System.out.println("\nArithmetic Operations:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        if (b != 0) {
            System.out.println("a / b = " + (a / b));      // Division
            System.out.println("a % b = " + (a % b));      // Modulus
        } else {
            System.out.println("Division and modulus by zero are undefined");
        }

        // Bitwise Operations
        System.out.println("\nBitwise Operations:");
        System.out.println("a & b (AND) = " + (a & b));
        System.out.println("a | b (OR) = " + (a | b));
        System.out.println("a ^ b (XOR) = " + (a ^ b));
        System.out.println("~a (NOT) = " + (~a));
        System.out.println("a << 1 (Left Shift) = " + (a << 1));
        System.out.println("a >> 1 (Right Shift) = " + (a >> 1));
        System.out.println("a >>> 1 (Unsigned Right Shift) = " + (a >>> 1));

        scanner.close();
    }
}
