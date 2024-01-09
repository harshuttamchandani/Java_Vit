import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class TaskExecutor {
    public static void main(String[] args) {
        // Create and name each runnable
        PrintTask task1 = new PrintTask("task1");
        PrintTask task2 = new PrintTask("task2");
        PrintTask task3 = new PrintTask("task3");

        System.out.println("Starting Executor");

        // Create ExecutorService to manage threads
        ExecutorService executorService = Executors.newCachedThreadPool();

        // Start the three PrintTasks
        executorService.execute(task1); // Start task1
        executorService.execute(task2); // Start task2
        executorService.execute(task3); // Start task3

        // Shut down ExecutorService (it decides when to shut down threads)
        executorService.shutdown();

        System.out.printf("Tasks started, main ends.%n%n");
    }
}
