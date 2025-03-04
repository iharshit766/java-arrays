import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner object for input
        
        int[] ages = new int[10]; // define an array to store ages of 10 students
        
        // loop to take input for all students
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt(); // read age input
        }
        
        scanner.close(); // close scanner to prevent resource leak
        
        // loop to check voting eligibility
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) { // check if age is negative
                System.out.println("Invalid age entered: " + ages[i]);
            } else if (ages[i] >= 18) { // check if student can vote
                System.out.println("The student with the age " + ages[i] + " can vote.");
            } else { // if age is less than 18
                System.out.println("The student with the age " + ages[i] + " cannot vote.");
            }
        }
    }
}
