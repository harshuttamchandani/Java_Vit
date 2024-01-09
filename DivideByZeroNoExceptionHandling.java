import java.util.Scanner;

public class DivideByZeroNoExceptionHandling {
    // Demonstrates throwing an exception when a divide-by-zero occurs
    public static int quotient(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Attempt to divide by zero");
        }
        return numerator / denominator;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter an integer numerator: ");
        int numerator = scanner.nextInt();

        System.out.print("Please enter an integer denominator: ");
        int denominator = scanner.nextInt();

        try {
            int result = quotient(numerator, denominator);
            System.out.printf("%nResult: %d / %d = %d%n", numerator, denominator, result);
        } catch (ArithmeticException e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }
}
