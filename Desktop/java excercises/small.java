import java.util.Scanner;

public class small {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Validate the input
        if (number <= 1) {
            System.out.println("Please enter a number greater than 1.");
        } else {
            int smallestFactor = number; // Initialize with the number itself (for prime case)
            
            // Find the smallest factor greater than 1
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    smallestFactor = i;
                    break;
                }
            }
            
            // Display the result
            System.out.println("Smallest factor other than 1: " + smallestFactor);
        }

        // Close the scanner
        scanner.close();
    }
}
