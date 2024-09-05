// Program to read a file and convert the content to uppercase
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Upperfile {
   public static void main(String[] args) {
       String filePath = "/home/lakshmi/Desktop/Upper.txt";
       String out="/home/lakshmi/Desktop/Upper2.txt";
       try(BufferedReader bf=new BufferedReader(new FileReader(filePath));
       BufferedWriter bw=new BufferedWriter(new FileWriter(out))){
        String line;
        while((line=bf.readLine())!=null){
            bw.write(line.toUpperCase());
            System.out.println("contents chanaged to uppercase");
        }
       }
       catch(IOException e){
           System.out.println("Error reading file: "+e.getMessage());
       }
   } 
   
}
