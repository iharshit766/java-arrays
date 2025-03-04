import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner object for input
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); // read number input
        scanner.close(); // close scanner to prevent resource leak

        int[] table = new int[10]; // define an array to store results

        // loop to store multiplication results in the array
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i; // store result
        }

        // loop to display multiplication table
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }
    }
}
