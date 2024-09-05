import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class DeleteTmpFiles {
    public static void main(String[] args) {
        // Path to the folder you want to search
        Path folderPath = Paths.get("/home/lakshmi/Desktop/Gani");

        try {
            // Walk through the directory and its subdirectories
            Files.walk(folderPath)
                .filter(Files::isRegularFile)  // Ensure it is a regular file
                .filter(path -> path.toString().endsWith(".tmp"))  // Filter for .tmp files
                .forEach(DeleteTmpFiles::deleteFile);  // Delete each .tmp file

        } catch (IOException e) {
            System.out.println("Error processing folder: " + e.getMessage());
        }
    }

    // Method to delete a file and handle potential exceptions
    private static void deleteFile(Path path) {
        try {
            Files.delete(path);  // Delete the file
            System.out.println("Deleted: " + path);
        } catch (IOException e) {
            System.out.println("Failed to delete: " + path + " - " + e.getMessage());
        }
    }
}

