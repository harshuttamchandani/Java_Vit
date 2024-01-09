import java.util.Random;

public class RollDie {
    public static void main(String[] args) {
        // Create a Random object to simulate die rolls
        Random random = new Random();

        // Array to store the frequency of each face
        int[] frequencies = new int[6];

        // Number of times to roll the die
        int numberOfRolls = 1000;

        // Simulate die rolls and count the frequencies
        for (int i = 0; i < numberOfRolls; i++) {
            int roll = random.nextInt(6) + 1; // Random number between 1 and 6
            frequencies[roll - 1]++; // Increment the corresponding element in the array
        }

        // Display the results
        System.out.println("Face\tFrequency");
        for (int face = 1; face <= 6; face++) {
            System.out.println(face + "\t" + frequencies[face - 1]);
        }
    }
}
