import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path; // Add this import statement
import java.util.List;
import java.util.stream.Collectors;

public class Tenlines {

    public static void main(String[] args) {
        // Ensure you provide the correct file path
        String filePath = "/home/lakshmi/Desktop/last.txt";
        
        try {
            // Read lines from the file
            List<String> lines = Files.lines(Path.of(filePath))
                                       .filter(line -> line.length() > 10)
                                       .sorted((a, b) -> Integer.compare(b.length(), a.length()))
                                       .collect(Collectors.toList())
                                        .subList(0, 5);
                                       for(String line:lines){
                                           System.out.println(line);
                                       }
            
            // Display top 5 lines
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
