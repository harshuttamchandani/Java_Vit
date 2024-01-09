// Fig. 6.14: InitArray.java
// Initializing an array using command-line arguments.
public class InitArray {
    public static void main(String[] args) {
        // Check the number of command-line arguments
        if (args.length != 3) {
            System.out.printf(
                "Error: Please re-enter the entire command, including%n" +
                "an array size, initial value, and increment.%n"
            );
        } else {
            // Get array size from the first command-line argument
            int arrayLength = Integer.parseInt(args[0]);
            int[] array = new int[arrayLength];

            // Get initial value and increment from command-line arguments
            int initialValue = Integer.parseInt(args[1]);
            int increment = Integer.parseInt(args[2]);

            // Calculate the value for each array element
            for (int counter = 0; counter < array.length; counter++) {
                array[counter] = initialValue + increment * counter;
            }

            System.out.printf("%5s%8s%n", "Index", "Value"); // Fixed formatting here

            // Display array index and value
            for (int counter = 0; counter < array.length; counter++) {
                System.out.printf("%5d%8d%n", counter, array[counter]);
            }
        }
    }
}
