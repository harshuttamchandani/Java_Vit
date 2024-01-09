public class UsingExceptions {
    public static void main(String[] args) {
        try {
            throwException();
        } catch (Exception exception) {
            System.err.println("Exception handled in main");
        }
        doesNotThrowException();
    }

    public static void throwException() throws Exception {
        try {
            System.out.println("Method throwException");
            throw new Exception(); // Generate an exception
        } catch (Exception exception) {
            System.err.println("Exception handled in method throwException");
            throw exception; // Rethrow the exception for further processing
        } finally {
            System.err.println("Finally executed in throwException");
        }
    }

    public static void doesNotThrowException() {
        try {
            System.out.println("Method doesNotThrowException");
        } catch (Exception exception) {
            // This block does not execute since there is no exception thrown
            System.err.println(exception);
        } finally {
            System.err.println("Finally executed in doesNotThrowException");
            System.out.println("End of method doesNotThrowException");
        }
    }
}
