public class FibonacciNonRecursive {
    public static int fibonacciNonRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1, next;
        for (int i = 2; i <= n; i++) {
            next = a + b;
            a = b;
            b = next;
        }
        return b;
    }

    public static void main(String[] args) {
        int n = 10;  // Example for 10th Fibonacci number
        System.out.println("The " + n + "th Fibonacci number (non-recursive) is: " + fibonacciNonRecursive(n));
    }
}
