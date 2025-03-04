import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create a scanner object to take user input

        // ask the user to enter a positive number
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt(); // read user input

        // check if the number is valid
        if (number <= 0) {
            System.out.println("invalid input! please enter a positive integer.");
            return; // exit the program if input is not valid
        }

        // create a string array to store the results
        String[] results = new String[number + 1];

        // loop from 0 to the entered number
        for (int i = 0; i <= number; i++) {
            // if the number is a multiple of both 3 and 5, store "fizzbuzz"
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "fizzbuzz";
            }
            // if the number is a multiple of 3, store "fizz"
            else if (i % 3 == 0) {
                results[i] = "fizz";
            }
            // if the number is a multiple of 5, store "buzz"
            else if (i % 5 == 0) {
                results[i] = "buzz";
            }
            // otherwise, store the number as a string
            else {
                results[i] = String.valueOf(i);
            }
        }

        scanner.close(); // close the scanner

        // display the results
        System.out.println("\nfizzbuzz results:");
        for (int i = 0; i <= number; i++) {
            System.out.println("position " + i + " = " + results[i]);
        }
    }
}

