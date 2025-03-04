import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner object
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); // read user input
        scanner.close(); // close scanner

        int[] multiplicationResult = new int[4]; // array to store results

        // loop from 6 to 9 to calculate multiplication results
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i; // store result in array
        }

        // display multiplication results
        System.out.println("Multiplication table for " + number + " from 6 to 9:");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }
    }
}
