class OuterClass {
    private String message = "Hello from Outer Class!";

    class InnerClass {
        public void printMessage() {
            System.out.println(message);
        }
    }
}

public class InnerClassExample15 {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.printMessage();
    }
}
