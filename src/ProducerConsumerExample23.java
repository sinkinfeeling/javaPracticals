class Queue {
    private int item;
    private boolean available = false;

    public synchronized int get() {
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        available = false;
        notifyAll();
        return item;
    }

    public synchronized void put(int item) {
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        this.item = item;
        available = true;
        notifyAll();
    }
}

class Producer implements Runnable {
    private Queue queue;

    public Producer(Queue queue) {
        this.queue = queue;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            queue.put(i);
            System.out.println("Produced: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
}

class Consumer implements Runnable {
    private Queue queue;

    public Consumer(Queue queue) {
        this.queue = queue;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            int value = queue.get();
            System.out.println("Consumed: " + value);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
}

public class ProducerConsumerExample23 {
    public static void main(String[] args) {
        Queue queue = new Queue();
        Thread producer = new Thread(new Producer(queue));
        Thread consumer = new Thread(new Consumer(queue));
        producer.start();
        consumer.start();
    }
}
