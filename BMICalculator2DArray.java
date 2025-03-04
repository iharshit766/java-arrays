import java.util.Scanner;

public class BMICalculator2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // taking input for number of persons
        System.out.print("enter the number of persons: ");
        int numPersons = scanner.nextInt();
        
        // creating a 2d array to store height, weight, and bmi
        double[][] personData = new double[numPersons][3]; // columns: 0 - weight, 1 - height, 2 - bmi
        String[] weightStatus = new String[numPersons];
        
        // taking input for height and weight of each person
        for (int i = 0; i < numPersons; i++) {
            System.out.println("enter details for person " + (i + 1) + ":");
            
            // validating weight input
            do {
                System.out.print("enter weight (kg): ");
                personData[i][0] = scanner.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("invalid input! weight must be a positive number.");
                }
            } while (personData[i][0] <= 0);
            
            // validating height input
            do {
                System.out.print("enter height (m): ");
                personData[i][1] = scanner.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("invalid input! height must be a positive number.");
                }
            } while (personData[i][1] <= 0);
        }
        
        // calculating bmi and determining weight status
        for (int i = 0; i < numPersons; i++) {
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]); // bmi formula
            
            // determining weight status based on bmi
            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] >= 25.0 && personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        
        // displaying results
        System.out.println("\nBMI Report:");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(m)", "Weight(kg)", "BMI", "Weight Status");
        for (int i = 0; i < numPersons; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n", personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }
        
        // closing scanner to prevent resource leak
        scanner.close();
    }
}
