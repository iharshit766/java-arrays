import java.util.Scanner;

public class StudentGrades3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // taking input for number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        
        // declaring 2D array to store marks of physics, chemistry, and maths
        int[][] marks = new int[numStudents][3];
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];
        
        // taking input for marks
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                while (true) {
                    System.out.print((j == 0 ? "Physics: " : j == 1 ? "Chemistry: " : "Maths: "));
                    int mark = scanner.nextInt();
                    if (mark >= 0) {
                        marks[i][j] = mark;
                        break;
                    }
                    System.out.println("Invalid input! Enter a positive value.");
                }
            }
        }
        
        // calculating percentage and grades
        for (int i = 0; i < numStudents; i++) {
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = totalMarks / 3.0;
            
            if (percentages[i] >= 80) grades[i] = 'A';
            else if (percentages[i] >= 70) grades[i] = 'B';
            else if (percentages[i] >= 60) grades[i] = 'C';
            else if (percentages[i] >= 50) grades[i] = 'D';
            else if (percentages[i] >= 40) grades[i] = 'E';
            else grades[i] = 'R';
        }
        
        // displaying the results
        System.out.println("\nStudent Grades:");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s\n", "Student", "Physics", "Chemistry", "Maths", "%", "Grade");
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.2f %-10c\n", (i + 1), marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }
        
        scanner.close();
    }
}
