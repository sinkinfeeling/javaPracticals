import java.util.Scanner;

// Class for Arithmetic Operations
class ArithmeticOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is undefined.");
        }
        return (double) a / b;
    }

    public int modulus(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Modulus by zero is undefined.");
        }
        return a % b;
    }
}

// Class for Bitwise Operations
class BitwiseOperations {
    public int and(int a, int b) {
        return a & b;
    }

    public int or(int a, int b) {
        return a | b;
    }

    public int xor(int a, int b) {
        return a ^ b;
    }

    public int not(int a) {
        return ~a;
    }

    public int leftShift(int a, int positions) {
        return a << positions;
    }

    public int rightShift(int a, int positions) {
        return a >> positions;
    }

    public int unsignedRightShift(int a, int positions) {
        return a >>> positions;
    }
}

// Main class to execute the methods
public class ArthBit3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input
        System.out.print("Enter the first integer (a): ");
        int a = scanner.nextInt();
        
        System.out.print("Enter the second integer (b): ");
        int b = scanner.nextInt();

        // Create objects for Arithmetic and Bitwise operations
        ArithmeticOperations arithmetic = new ArithmeticOperations();
        BitwiseOperations bitwise = new BitwiseOperations();
        
        // Arithmetic Operations
        System.out.println("\nArithmetic Operations:");
        System.out.println("a + b = " + arithmetic.add(a, b));
        System.out.println("a - b = " + arithmetic.subtract(a, b));
        System.out.println("a * b = " + arithmetic.multiply(a, b));
        
        try {
            System.out.println("a / b = " + arithmetic.divide(a, b));
            System.out.println("a % b = " + arithmetic.modulus(a, b));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        // Bitwise Operations
        System.out.println("\nBitwise Operations:");
        System.out.println("a & b (AND) = " + bitwise.and(a, b));
        System.out.println("a | b (OR) = " + bitwise.or(a, b));
        System.out.println("a ^ b (XOR) = " + bitwise.xor(a, b));
        System.out.println("~a (NOT) = " + bitwise.not(a));
        System.out.println("a << 1 (Left Shift) = " + bitwise.leftShift(a, 1));
        System.out.println("a >> 1 (Right Shift) = " + bitwise.rightShift(a, 1));
        System.out.println("a >>> 1 (Unsigned Right Shift) = " + bitwise.unsignedRightShift(a, 1));

        scanner.close();
    }
}
