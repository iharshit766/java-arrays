import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // taking user input
        System.out.print("enter a number: ");
        int number = scanner.nextInt();
        
        // finding the number of digits
        int temp = number;
        int count = 0;
        while (temp != 0) {
            count++;
            temp /= 10;
        }
        
        // creating array to store digits
        int[] digits = new int[count];
        
        // extracting digits and storing in the array
        temp = number;
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10; // get last digit
            temp /= 10; // remove last digit
        }
        
        // displaying the number in reverse order
        System.out.print("reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }
        
        // closing scanner to prevent resource leak
        scanner.close();
    }
}
