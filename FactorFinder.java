import java.util.Scanner;

public class FactorFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner object

        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); // take user input

        int maxFactor = 10; // initial array size
        int[] factors = new int[maxFactor]; // array to store factors
        int index = 0; // to track the number of factors stored

        // Loop through numbers from 1 to number and find factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) { // check if i is a factor
                if (index == maxFactor) { // need to expand the array
                    maxFactor *= 2; // double the size
                    int[] temp = new int[maxFactor]; // create new array
                    System.arraycopy(factors, 0, temp, 0, index); // copy old factors
                    factors = temp; // assign new array to factors
                }
                factors[index++] = i; // store the factor
            }
        }

        scanner.close(); // close scanner

        // Print factors
        System.out.print("Factors of " + number + ": ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();
    }
}
