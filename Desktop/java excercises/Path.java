import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

 class MyPaath{

    public static void main(String[] args) {
        // Path to the folder you want to search
        java.nio.file.Path folderPath = Paths.get("/home/lakshmi/Desktop/Gani");
        
        try {
            // List all .txt files in the given folder recursively
            Files.walk(folderPath)
                .filter(Files::isRegularFile)  // Ensure it is a regular file
                .filter(path -> path.toString().endsWith(".txt"))  // Filter for .txt files
                .forEach(System.out::println);  // Print each .txt file path
                
        } catch (IOException e) {
            System.out.println("Error reading folder: " + e.getMessage());
        }
    }
}
