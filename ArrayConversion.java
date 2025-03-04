import java.util.Scanner;

public class ArrayConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for rows and columns
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = scanner.nextInt();

        // Creating a 2D array
        int[][] matrix = new int[rows][columns];

        // Taking input for 2D array
        System.out.println("Enter elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Creating a 1D array to store elements of the 2D array
        int[] singleArray = new int[rows * columns];
        int index = 0;

        // Copying elements from 2D array to 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                singleArray[index++] = matrix[i][j];
            }
        }

        scanner.close(); // Closing scanner

        // Displaying the 1D array
        System.out.println("\nElements in 1D array:");
        for (int num : singleArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
