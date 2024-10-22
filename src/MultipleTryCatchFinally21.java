public class MultipleTryCatchFinally21 {
    public static void main(String[] args) {
        try {
            int[] array = new int[5];
            array[10] = 30 / 0;  // ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred.");
        } finally {
            System.out.println("This will always execute (finally block).");
        }
    }
}
