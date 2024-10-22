import java.util.Random;

class NumberGenerator implements Runnable {
    public int number;
    private boolean isEven;

    public synchronized void generate() {
        Random random = new Random();
        this.number = random.nextInt(100);
        System.out.println("Generated number: " + number);
        isEven = (number % 2 == 0);
        notifyAll();
    }

    public synchronized void process() {
        try {
            wait();
        } catch (InterruptedException e) {}
        if (isEven) {
            System.out.println("Square: " + (number * number));
        } else {
            System.out.println("Cube: " + (number * number * number));
        }
    }

    public void run() {
        while (true) {
            generate();
            process();
        }
    }
}

public class MultiThreadedApplication24 {
    public static void main(String
