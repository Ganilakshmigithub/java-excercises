import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        final int MAX_NUMBERS = 5;
        int 
        System.out.println("Enter up to " + MAX_NUMBERS + " numbers. Invalid numbers will be ignored.");

        while (count < MAX_NUMBERS) {
            System.out.print("Enter a number: ");
            String input = sc.nextLine();

            try {
                // Try parsing the input as an integer
                int number = Integer.parseInt(input);
                sum += number;
                count++;
            } catch (NumberFormatException e) {
                // If input is invalid, print an error message and continue
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        if (count > 0) {
            double average = sum / count;
            System.out.printf("The average of the valid numbers is: %.2f%n", average);
        } else {
            System.out.println("No valid numbers were entered.");
        }

        sc.close();
    }
}
