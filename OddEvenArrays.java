import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner object

        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt(); // take user input

        // Validate natural number input
        if (number < 1) {
            System.out.println("Error: Please enter a natural number (greater than 0).");
            return;
        }

        // Create arrays for odd and even numbers
        int[] oddNumbers = new int[number / 2 + 1];
        int[] evenNumbers = new int[number / 2 + 1];

        int oddIndex = 0, evenIndex = 0; // indexes for arrays

        // Loop from 1 to number and separate odd and even numbers
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i; // store even number
            } else {
                oddNumbers[oddIndex++] = i; // store odd number
            }
        }

        scanner.close(); // close scanner

        // Print odd numbers array
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();

        // Print even numbers array
        System.out.print("Even numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();
    }
}
