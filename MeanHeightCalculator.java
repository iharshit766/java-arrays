import java.util.Scanner;

public class MeanHeightCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner object
        double[] heights = new double[11]; // array to store heights
        double sum = 0; // variable to store sum of heights

        // loop to get heights input
        System.out.println("Enter the heights of 11 football players (in cm):");
        for (int i = 0; i < 11; i++) {
            System.out.print("Player " + (i + 1) + " height: ");
            heights[i] = scanner.nextDouble(); // store input in array
            sum += heights[i]; // add height to sum
        }
        scanner.close(); // close scanner

        // calculate mean height
        double mean = sum / 11;
        System.out.println("The mean height of the football team is: " + mean + " cm");
    }
}
