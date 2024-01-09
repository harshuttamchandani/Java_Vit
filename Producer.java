// Fig. 23.10: Producer.java
// Producer with a run method that inserts the values 1 to 10 in a buffer.
import java.security.SecureRandom;

public class Producer implements Runnable {
    private static final SecureRandom generator = new SecureRandom();
    private final Buffer sharedLocation; // reference to shared object

    // Constructor
    public Producer(Buffer sharedLocation) {
        this.sharedLocation = sharedLocation;
    }

    // Store values from 1 to 10 in sharedLocation
    @Override
    public void run() {
        int sum = 0;
        for (int count = 1; count <= 10; count++) {
            try {
                // Sleep 0 to 3 seconds, then place value in Buffer
                Thread.sleep(generator.nextInt(3000)); // Random sleep
                sharedLocation.blockingPut(count); // Set value in buffer
                sum += count; // Increment sum of values
                System.out.printf("\t%2d%n", sum);
            } catch (InterruptedException exception) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.printf("Producer done producing%nTerminating Producer%n");
    }
}
