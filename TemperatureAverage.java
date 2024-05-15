import java.util.*;

public class TemperatureAverage {
    public static void main(String[] args) {
        final int NUM_TEMPS = 8;
        double[] temperatures = new double[NUM_TEMPS];
        double total = 0;
        Scanner scanner = new Scanner(System.in);

        // Step 1: Collect temperature data from the user
        for (int i = 0; i < NUM_TEMPS; i++) {
            boolean validInput = false;
            while (!validInput) {
                System.out.print("Please enter temperature #" + (i + 1) + ": ");
                if (scanner.hasNextDouble()) {
                    temperatures[i] = scanner.nextDouble();
                    total += temperatures[i];
                    validInput = true;
                } else {
                    System.out.println("Error: Please enter a valid number.");
                    scanner.next(); // Discard invalid input
                }
            }
        }

        // Step 2: Compute the average temperature
        double averageTemp = total / NUM_TEMPS;
        System.out.println("\nTemperatures recorded: " + java.util.Arrays.toString(temperatures));
        System.out.printf("Average temperature: %.2f degrees\n", averageTemp);

        // Step 3: Determine how many temperatures are above the average
        int countAboveAverage = 0;
        for (double temp : temperatures) {
            if (temp > averageTemp) {
                countAboveAverage++;
            }
        }

        // Step 4: Display the result
        System.out.println("Number of temperatures above the average: " + countAboveAverage);
        scanner.close();
    }
}
