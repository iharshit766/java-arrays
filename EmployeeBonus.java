import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numEmployees = 10;
        
        // declaring arrays to store employee details
        double[] salaries = new double[numEmployees]; // store salaries
        double[] yearsOfService = new double[numEmployees]; // store years of service
        double[] bonuses = new double[numEmployees]; // store calculated bonuses
        double[] newSalaries = new double[numEmployees]; // store updated salaries
        
        // variables to store total amounts
        double totalOldSalary = 0;
        double totalBonus = 0;
        double totalNewSalary = 0;
        
        // taking input from the user
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("enter details for employee " + (i + 1) + ":");
            
            // getting a valid salary input
            double salary;
            while (true) {
                System.out.print("enter salary: ");
                salary = scanner.nextDouble();
                if (salary > 0) break; // salary must be greater than 0
                System.out.println("invalid input! salary must be greater than 0.");
            }
            
            // getting a valid years of service input
            double years;
            while (true) {
                System.out.print("enter years of service: ");
                years = scanner.nextDouble();
                if (years >= 0) break; // years of service must be 0 or more
                System.out.println("invalid input! years of service must be 0 or more.");
            }
            
            // storing values in arrays
            salaries[i] = salary;
            yearsOfService[i] = years;
        }
        
        // calculating bonus and new salary
        for (int i = 0; i < numEmployees; i++) {
            double bonusPercentage = (yearsOfService[i] > 5) ? 0.05 : 0.02; // 5% if more than 5 years, else 2%
            double bonusAmount = salaries[i] * bonusPercentage; // calculating bonus
            double newSalary = salaries[i] + bonusAmount; // calculating new salary
            
            // storing calculated values
            bonuses[i] = bonusAmount;
            newSalaries[i] = newSalary;
            
            // updating total values
            totalOldSalary += salaries[i];
            totalBonus += bonusAmount;
            totalNewSalary += newSalary;
        }
        
        // displaying individual employee details
        System.out.println("\nemployee bonus details:");
        for (int i = 0; i < numEmployees; i++) {
            System.out.printf("employee %d: old salary: %.2f, bonus: %.2f, new salary: %.2f\n",
                              (i + 1), salaries[i], bonuses[i], newSalaries[i]);
        }
        
        // displaying total calculations
        System.out.println("\ntotal summary:");
        System.out.printf("total old salary: %.2f\n", totalOldSalary);
        System.out.printf("total bonus payout: %.2f\n", totalBonus);
        System.out.printf("total new salary: %.2f\n", totalNewSalary);
        
        // closing scanner to prevent resource leak
        scanner.close(); 
    }
}
