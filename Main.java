public class Main {
    public static void main(String[] args) {
        Buffer sharedBuffer = new Buffer(); // Replace with your actual buffer class
        Producer producer = new Producer(sharedBuffer);
        Consumer consumer = new Consumer(sharedBuffer);

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();
    }
}
