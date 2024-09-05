import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;

public class Unique{

    public static void main(String[] args) {
        // Path to the file
        String filePath = "/home/lakshmi/Desktop/Upper.txt";
        
        try {
            // Read lines from the file, process them, and print results
            Files.lines(Path.of(filePath))
                // Remove duplicates by collecting into a Set
                .collect(Collectors.toSet())
                // Sort the unique names
                .stream()
                .sorted()
                // Collect into a List to retain sorted order
                .collect(Collectors.toList())
                // Print each name with its length
                .forEach(name -> System.out.println(name + ": " + name.length()));
                
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
