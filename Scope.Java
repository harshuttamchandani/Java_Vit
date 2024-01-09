public class Scope {
    // Field that is accessible to all methods of this class
    private static int x = 1;

    // Method main creates and initializes local variable x
    // and calls methods useLocalVariable and useField
    public static void main(String[] args) {
        int x = 5; // Method's local variable x shadows field x
        System.out.printf("local x in main is %d%n", x);
        useLocalVariable(); // useLocalVariable has local x
        useField(); // useField uses class Scope's field x
        useLocalVariable(); // useLocalVariable reinitializes local x
        useField(); // class Scope's field x retains its value
        System.out.printf("%nlocal x in main is %d%n", x);
    }

    // Create and initialize local variable x during each call
    public static void useLocalVariable() {
        int x = 25; // Initialized each time useLocalVariable is called
        System.out.printf("%nlocal x on entering method useLocalVariable is %d%n", x);
        ++x; // Modifies this method's local variable x
        System.out.printf("local x before exiting method useLocalVariable is %d%n", x);
    }

    // Modify class Scope's field x during each call
    public static void useField() {
        System.out.printf("field x on entering method useField is %d%n", x);
        x *= 10; // Modifies class Scope's field x
        System.out.printf("field x before exiting method useField is %d%n", x);
    }
}
