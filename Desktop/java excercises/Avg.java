import java.util.Scanner;

public class Avg{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        int totalNumbers = 10;

        System.out.println("Please enter 10 numbers:");

        while (count < totalNumbers) {
            System.out.print("Number " + (count + 1) + ": ");
            String input = scanner.nextLine();

            try {
                double number = Double.parseDouble(input);

                if (number < 0) {
                    System.out.println("Negative numbers are ignored.");
                } else {
                    sum += number;
                    count++;
                }
            } catch (NumberFormatException e) {
                // Ignore invalid numbers silently
            }
        }

        scanner.close();

        if (count > 0) {
            double average = sum / count;
            System.out.printf("The average of the valid numbers is: %.2f%n", average);
        } else {
            System.out.println("No valid numbers were entered.");
        }
    }
}

