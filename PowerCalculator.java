public class PowerCalculator {
    public static void main(String[] args) {
        System.out.println("Please provide two command-line arguments: a and b");

        if (args.length != 2) {
            return;
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        double result = Math.pow(a, b);
        System.out.println(a + "^" + b + " = " + result);
    }
}
