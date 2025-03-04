import java.util.Scanner;

public class BMICalculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // taking input for number of persons
        System.out.print("enter the number of persons: ");
        int numPersons = scanner.nextInt();
        
        // creating arrays to store height, weight, bmi, and weight status
        double[] weights = new double[numPersons];
        double[] heights = new double[numPersons];
        double[] bmis = new double[numPersons];
        String[] weightStatus = new String[numPersons];
        
        // taking input for height and weight of each person
        for (int i = 0; i < numPersons; i++) {
            System.out.println("enter details for person " + (i + 1) + ":");
            
            System.out.print("enter weight (kg): ");
            weights[i] = scanner.nextDouble();
            
            System.out.print("enter height (m): ");
            heights[i] = scanner.nextDouble();
        }
        
        // calculating bmi and determining weight status
        for (int i = 0; i < numPersons; i++) {
            bmis[i] = weights[i] / (heights[i] * heights[i]); // bmi formula
            
            // determining weight status based on bmi
            if (bmis[i] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmis[i] >= 18.5 && bmis[i] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmis[i] >= 25.0 && bmis[i] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        
        // displaying results
        System.out.println("\nBMI Report:");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(m)", "Weight(kg)", "BMI", "Weight Status");
        for (int i = 0; i < numPersons; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n", heights[i], weights[i], bmis[i], weightStatus[i]);
        }
        
        // closing scanner to prevent resource leak
        scanner.close();
    }
}
