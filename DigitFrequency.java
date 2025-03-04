import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // taking input for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // creating an array to store digit frequencies (size 10 for digits 0-9)
        int[] frequency = new int[10];
        
        // finding the frequency of each digit
        int tempNumber = Math.abs(number); // handling negative numbers
        while (tempNumber > 0) {
            int digit = tempNumber % 10; // extracting the last digit
            frequency[digit]++; // incrementing the frequency of the digit
            tempNumber /= 10; // removing the last digit
        }
        
        // displaying the frequency of each digit
        System.out.println("Digit Frequency in the given number:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " times");
            }
        }
        
        // closing the scanner
        scanner.close();
    }
}
