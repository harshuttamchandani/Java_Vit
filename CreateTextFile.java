import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateTextFile {
    public static void main(String[] args) {
        // open clients.txt, output data to the file then close clients.txt
        try (Formatter output = new Formatter("clients.txt")) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter account number, first name, last name, and balance.");
            System.out.println("Enter end-of-file indicator to end input.");

            while (input.hasNext()) { // loop until end-of-file indicator
                try {
                    // output new record to file; assumes valid input
                    output.format("%d %s %s %.2f%n", input.nextInt(),
                            input.next(), input.next(), input.nextDouble());
                } catch (NoSuchElementException elementException) {
                    System.err.println("Invalid input. Please try again.");
                    input.nextLine(); // discard input so user can try again
                }
                System.out.print("Enter account number, first name, last name, and balance (or Ctrl+Z to end): ");
            }
        } catch (SecurityException | FileNotFoundException | FormatterClosedException e) {
            e.printStackTrace();
        }
    }
}
