public class FibonacciRecursive {
    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;  // Example for 10th Fibonacci number
        System.out.println("The " + n + "th Fibonacci number (recursive) is: " + fibonacciRecursive(n));
    }
}
