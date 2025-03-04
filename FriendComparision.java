import java.util.Scanner;

public class FriendComparision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] friends = {"Amar", "Akbar", "Anthony"}; // names of friends
        int[] ages = new int[3]; // array to store ages
        double[] heights = new double[3]; // array to store heights

        // taking input for ages and heights
        for (int i = 0; i < 3; i++) {
            System.out.println("enter age and height for " + friends[i] + ":");
            
            // getting a valid age input
            while (true) {
                System.out.print("enter age: ");
                ages[i] = scanner.nextInt();
                if (ages[i] > 0) break; // age must be greater than 0
                System.out.println("invalid input! age must be greater than 0.");
            }
            
            // getting a valid height input
            while (true) {
                System.out.print("enter height (in cm): ");
                heights[i] = scanner.nextDouble();
                if (heights[i] > 0) break; // height must be greater than 0
                System.out.println("invalid input! height must be greater than 0.");
            }
        }
        
        // finding the youngest friend
        int minAgeIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[minAgeIndex]) {
                minAgeIndex = i;
            }
        }
        
        // finding the tallest friend
        int maxHeightIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[maxHeightIndex]) {
                maxHeightIndex = i;
            }
        }
        
        // displaying the results
        System.out.println("\nyoungest friend: " + friends[minAgeIndex] + " (age: " + ages[minAgeIndex] + ")");
        System.out.println("tallest friend: " + friends[maxHeightIndex] + " (height: " + heights[maxHeightIndex] + " cm)");
        
        // closing scanner to prevent resource leak
        scanner.close();
    }
}
