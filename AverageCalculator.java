public class AverageCalculator {
    public static double calculateAverage(double... numbers) {
        if (numbers.length == 0) {
            return 0.0;
        }
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    public static void main(String[] args) {
        // Example usage
        double average1 = calculateAverage(2, 4, 6, 8, 10);
        System.out.println("Average 1: " + average1);

        double average2 = calculateAverage(5, 10, 15);
        System.out.println("Average 2: " + average2);
    }
}
