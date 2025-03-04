import java.util.Scanner;

public class StoreNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner object
        double[] numbers = new double[10]; // array to store up to 10 numbers
        double total = 0.0; // variable to store the sum of numbers
        int index = 0; // index for array

        // infinite loop to take user input
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = scanner.nextDouble(); // read user input

            if (num <= 0) { // break loop if user enters 0 or negative number
                break;
            }

            if (index == 10) { // break loop if array is full
                System.out.println("Array is full. No more entries allowed.");
                break;
            }

            numbers[index] = num; // store the number in array
            index++; // increment index
        }
        
        scanner.close(); // close scanner

        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) { // loop to display entered numbers
            System.out.print(numbers[i] + " ");
            total += numbers[i]; // add to total
        }

        System.out.println("\nSum of all numbers: " + total); // print total
    }
}
