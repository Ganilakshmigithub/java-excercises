import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Sortname {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> names=new ArrayList<String>();
        while (true) { 
            System.out.println("Enter a names until end: ");
            String s=sc.nextLine();
            if(s.equalsIgnoreCase("end")){
                break;
            }
            else{
                names.add(s);
            }
        }
        Collections.sort(names);
        try(BufferedWriter bw=new BufferedWriter(new FileWriter("/home/lakshmi/Desktop/last.txt"))){
            for(String name:names){
                bw.write(name);
                bw.newLine();
            }
    }
    catch(IOException e){
        e.printStackTrace();
    }
    }
}
