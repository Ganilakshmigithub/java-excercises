import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Filesort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter names and if you wantto stop enter END or end:");
        ArrayList<String> n=new ArrayList<>();
        while(true){
            String name=sc.nextLine();
            if("END".equalsIgnoreCase(name)){
                break;
            }
            else{
                n.add(name);
            }
        }
            Collections.sort(n);
            try{
                BufferedWriter writer=new BufferedWriter(new FileWriter("/home/lakshmi/Desktop/names.txt"));
                for(String s:n){
                    writer.write(s);
                    writer.newLine();
                }
                writer.close();
                System.out.println("Names sorted successfully and stored in names.txt");
            }
            catch(IOException e){
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }

