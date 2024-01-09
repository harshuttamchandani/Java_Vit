public class StringOperations {
    public static void main(String[] args) {
        String inputString = "Hello, World!";

        // Print the length of the string
        int length = inputString.length();
        System.out.println("Length of the string: " + length);

        // Trim the string
        String trimmedString = inputString.trim();
        System.out.println("Trimmed String: " + trimmedString);

        // Convert the string to upper case
        String upperCaseString = inputString.toUpperCase();
        System.out.println("Uppercase String: " + upperCaseString);

        // Get a sub-string from given indices (inclusive)
        int startIndex = 7; // Inclusive
        int endIndex = 12; // Inclusive
        String subString = inputString.substring(startIndex, endIndex + 1); // Add 1 to include endIndex
        System.out.println("Sub-String from index " + startIndex + " to " + endIndex + ": " + subString);

        // Reverse the string
        StringBuilder reversedString = new StringBuilder(inputString).reverse();
        System.out.println("Reversed String: " + reversedString);
    }
} 