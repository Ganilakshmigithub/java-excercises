import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class StudentMarks {

    public static void main(String[] args) {
        // Path to the marks.txt file
        String filePath = "/home/lakshmi/Desktop/marks.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int rollNo = 1; // Roll number starts from 1

            while ((line = br.readLine()) != null) {
                try {
                    // Split the line by comma and parse the numbers
                    String[] marksStr = line.split(",");
                    int totalMarks = 0;

                    for (String mark : marksStr) {
                        totalMarks += Integer.parseInt(mark.trim()); // Handle extra spaces
                    }

                    // Display roll number and total marks
                    System.out.println("Roll No: " + rollNo + ", Total Marks: " + totalMarks);

                } catch (NumberFormatException e) {
                    System.out.println("Error: Invalid number format on roll number " + rollNo);
                } catch (Exception e) {
                    System.out.println("Error processing roll number " + rollNo + ": " + e.getMessage());
                }

                rollNo++;
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

