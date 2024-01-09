public class GenericPrinter {
    // Generic method to print elements of an array
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Test the generic method with different types of arrays
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        Character[] charArray = { 'A', 'B', 'C', 'D', 'E' };

        System.out.println("Printing Integer Array:");
        printArray(intArray);

        System.out.println("\nPrinting Double Array:");
        printArray(doubleArray);

        System.out.println("\nPrinting Character Array:");
        printArray(charArray);
    }
}
