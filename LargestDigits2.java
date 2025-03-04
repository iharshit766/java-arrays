import java.util.Scanner;
import java.util.Arrays;

public class LargestDigits2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxDigits = 10; // initial maximum size of the array
        int[] digits = new int[maxDigits]; // array to store digits
        int index = 0; // array index tracker
        
        // taking user input
        System.out.print("enter a number: ");
        int number = scanner.nextInt();
        
        // extracting digits and storing in the array
        while (number != 0) {
            // if index reaches maxDigits, increase the size of the array
            if (index == maxDigits) {
                maxDigits += 10; // increase maxDigits by 10
                int[] temp = new int[maxDigits]; // create a new temp array with larger size
                System.arraycopy(digits, 0, temp, 0, digits.length); // copy old values to new array
                digits = temp; // assign new array to digits
            }
            
            digits[index] = number % 10; // get the last digit
            number /= 10; // remove last digit from number
            index++; // move to next index
        }
        
        // initializing largest and second largest
        int largest = -1;
        int secondLargest = -1;
        
        // finding largest and second largest digit
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        
        // displaying results
        System.out.println("largest digit: " + largest);
        System.out.println("second largest digit: " + (secondLargest != -1 ? secondLargest : "not available"));
        
        // closing scanner to prevent resource leak
        scanner.close();
    }
}
