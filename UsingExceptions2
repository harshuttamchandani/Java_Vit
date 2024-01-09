public class UsingExceptions2 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception exception) {
            System.err.println(exception.getMessage());
            exception.printStackTrace();

            // Obtain the stack trace information
            StackTraceElement[] traceElements = exception.getStackTrace();

            System.out.printf("%nStack trace from getStackTrace:%n");
            System.out.println("Class\t\tFile\t\tLine\tMethod");

            // Loop through traceElements to get exception description
            for (StackTraceElement element : traceElements) {
                System.out.printf("%s\t", element.getClassName());
                System.out.printf("%s\t", element.getFileName());
                System.out.printf("%s\t", element.getLineNumber());
                System.out.printf("%s%n", element.getMethodName());
            }
        }
    }

    // Call method2; throw exceptions back to main
    public static void method1() throws Exception {
        method2();
    }

    // Call method3; throw exceptions back to method1
    public static void method2() throws Exception {
        method3();
    }

    // Throw Exception back to method2
    public static void method3() throws Exception {
        throw new Exception("Exception thrown in method3");
    }
}
