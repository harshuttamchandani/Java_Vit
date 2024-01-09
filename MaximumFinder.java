import java.util.Scanner;

public class MaximumFinder {
    public static void main(String[] args) {
        // create Scanner for input from the command window
        Scanner input = new Scanner(System.in);

        // prompt for and input three floating-point values
        System.out.print("Enter three floating-point values separated by spaces: ");
        double number1 = input.nextDouble(); // read the first double
        double number2 = input.nextDouble(); // read the second double
        double number3 = input.nextDouble(); // read the third double

        // determine the maximum value
        double result = maximum(number1, number2, number3);

        // display the maximum value
        System.out.println("Maximum is: " + result);
    }

    // returns the maximum of its three double parameters
    public static double maximum(double x, double y, double z) {
        double maximumValue = x; // assume x is the largest to start

        // determine whether y is greater than maximumValue
        if (y > maximumValue) {
            maximumValue = y;
        }

        // determine whether z is greater than maximumValue
        if (z > maximumValue) {
            maximumValue = z;
        }

        return maximumValue;
    }
}
