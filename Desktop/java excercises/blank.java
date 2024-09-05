import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class blank {
    public static void main(String[] args) {
        // Define input and output file paths
        String inputFilePath = "/home/lakshmi/Desktop/Gani001.txt";
        String outputFilePath = "/home/lakshmi/Desktop/last.txt";
        
        // Use try-with-resources to ensure that the files are closed properly
        try (BufferedReader br = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFilePath))) {
             
            String line;
            
            // Read lines from the input file
            while ((line = br.readLine()) != null) {
                // Write the non-blank line to the output file
                if (!line.trim().isEmpty()) {
                    bw.write(line);
                    bw.newLine();  // Ensure new lines are preserved
                }
            }
            
            System.out.println("Blank lines removed successfully.");
            
        } catch (IOException e) {
            System.err.println("An error occurred while processing the file.");
            e.printStackTrace();
        }
    }
}
