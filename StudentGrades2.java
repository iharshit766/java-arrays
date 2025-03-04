import java.util.Scanner;

public class StudentGrades2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // taking input for number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // creating arrays to store marks, percentages, and grades
        int[][] marks = new int[numStudents][3]; // stores marks for physics, chemistry, maths
        double[] percentages = new double[numStudents]; // stores percentage of each student
        char[] grades = new char[numStudents]; // stores grade of each student

        // taking input for marks
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + " (out of 100):");
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                while (true) {
                    System.out.print(subject + ": ");
                    marks[i][j] = scanner.nextInt();
                    if (marks[i][j] >= 0 && marks[i][j] <= 100) break;
                    System.out.println("Invalid input! Enter a value between 0 and 100.");
                }
            }
        }

        // calculating percentage and assigning grades
        for (int i = 0; i < numStudents; i++) {
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2]; // sum of marks
            percentages[i] = totalMarks / 3.0; // calculating percentage

            // assigning grade based on percentage
            if (percentages[i] >= 80) grades[i] = 'A';
            else if (percentages[i] >= 70) grades[i] = 'B';
            else if (percentages[i] >= 60) grades[i] = 'C';
            else if (percentages[i] >= 50) grades[i] = 'D';
            else if (percentages[i] >= 40) grades[i] = 'E';
            else grades[i] = 'R';
        }

        // displaying results
        System.out.println("\nStudent Results:");
        System.out.printf("%-10s %-10s %-10s %-10s %-15s %-10s\n", "Student", "Physics", "Chemistry", "Maths", "Percentage", "Grade");
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-15.2f %-10c\n", (i + 1), marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }

        // closing scanner to prevent resource leak
        scanner.close();
    }
}
