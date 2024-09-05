import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Day {

    public static void main(String[] args) {
        // Create a scanner to read input
        Scanner scanner = new Scanner(System.in);
        
        // Define the date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // Read the first date
        System.out.print("Enter the first date (dd-MM-yyyy): ");
        String firstDateInput = scanner.nextLine();
        
        // Read the second date
        System.out.print("Enter the second date (dd-MM-yyyy): ");
        String secondDateInput = scanner.nextLine();
        
        try {
            // Parse the dates
            LocalDate firstDate = LocalDate.parse(firstDateInput, formatter);
            LocalDate secondDate = LocalDate.parse(secondDateInput, formatter);
            
            // Calculate the number of days between the two dates
            long daysBetween = ChronoUnit.DAYS.between(firstDate, secondDate);
            
            // Output the result
            System.out.println("Number of days between the two dates: " + Math.abs(daysBetween));
            
        } catch (Exception e) {
            System.out.println("Invalid date format. Please enter dates in dd-MM-yyyy format.");
        }
    }
}

