import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner object for input
        
        int[] numbers = new int[5]; // define an array to store 5 numbers

        // loop to take input for all 5 numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt(); // read number input
        }

        scanner.close(); // close scanner to prevent resource leak

        // loop to check positive, negative, or zero
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) { // check if number is positive
                if (numbers[i] % 2 == 0) { // check if even
                    System.out.println(numbers[i] + " is positive and even.");
                } else { // check if odd
                    System.out.println(numbers[i] + " is positive and odd.");
                }
            } else if (numbers[i] < 0) { // check if number is negative
                System.out.println(numbers[i] + " is negative.");
            } else { // check if number is zero
                System.out.println(numbers[i] + " is zero.");
            }
        }

        // compare first and last elements of the array
        if (numbers[0] > numbers[4]) {
            System.out.println("The first number " + numbers[0] + " is greater than the last number " + numbers[4]);
        } else if (numbers[0] < numbers[4]) {
            System.out.println("The first number " + numbers[0] + " is less than the last number " + numbers[4]);
        } else {
            System.out.println("The first number " + numbers[0] + " is equal to the last number " + numbers[4]);
        }
    }
}
