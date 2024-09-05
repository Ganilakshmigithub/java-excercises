import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

class Avgg {

    public static void main(String[] args) {
        // Path to the file
        String filePath = "/home/lakshmi/Desktop/target.txt";
        
        try {
            // Read all numbers from the file and parse them into a list of doubles
            List<Double> numbers = Files.lines(Path.of(filePath))
                .map(Double::parseDouble)
                .collect(Collectors.toList());
            
            // If the list is empty, there's no average to compute
            if (numbers.isEmpty()) {
                System.out.println("No numbers to process.");
                return;
            }
            
            // Calculate the average
            double average = numbers.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElseThrow(() -> new IllegalStateException("Average calculation failed"));
            
            // Display numbers greater than the average
            System.out.println("Numbers greater than average (" + average + "):");
            numbers.stream()
                .filter(number -> number > average)
                .forEach(System.out::println);
                
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format in file.");
        }
    }
}
