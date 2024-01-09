import javafx.concurrent.Task;

public class FibonacciTask extends Task<Long> {
    private final int n; // Fibonacci number to calculate

    // Constructor
    public FibonacciTask(int n) {
        this.n = n;
    }

    // Long-running code to be run in a worker thread
    @Override
    protected Long call() {
        updateMessage("Calculating..."); // Update a message for UI feedback
        long result = fibonacci(n); // Calculate the Fibonacci number
        updateMessage("Done calculating."); // Update a message when done
        return result; // Return the result to be used by JavaFX application
    }

    // Recursive method 'fibonacci'; calculates the nth Fibonacci number
    public long fibonacci(long number) {
        if (number == 0 || number == 1) {
            return number;
        } else {
            return fibonacci(number - 1) + fibonacci(number - 2);
        }
    }
}
