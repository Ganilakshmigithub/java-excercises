import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Singlespace {
    public static void main(String[] args) {
        String input="/home/lakshmi/Desktop/last.txt";
        String output="/home/lakshmi/Desktop/marks.txt";
        try(BufferedReader br=new BufferedReader(new FileReader(input));
            BufferedWriter bw=new BufferedWriter(new FileWriter(output))){
            String line;
            while((line=br.readLine())!=null){
                if(!line.trim().isEmpty()){
                    String normal=line.replaceAll("\\s+"," ");
                    bw.write(normal);
                    bw.newLine();
                }
            }
            System.out.println("Blank lines removed successfully.");
        }
        catch(IOException e){
            System.err.println("An error occurred while processing the file.");
            e.printStackTrace();
    }
}
}
