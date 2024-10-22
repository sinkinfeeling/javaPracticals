public class MultipleCatchExample20 {
    public static void main(String[] args) {
        try {
            int[] array = new int[5];
            array[10] = 30 / 0;  // This will trigger multiple exceptions
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
        }
    }
}
