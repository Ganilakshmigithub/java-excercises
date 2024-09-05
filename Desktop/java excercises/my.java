import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class my{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        ArrayList<String> list=new ArrayList<>();
        System.out.println("enter names");
        while(true){
            String i=sc.nextLine();
            if(i.equalsIgnoreCase("end")){
                break;
            }
            else{
                list.add(i);
            }
        }
        Collections.sort(list);
        String path="/home/lakshmi/Desktop/Upper.txt";
        try(BufferedWriter bw=new BufferedWriter(new FileWriter(path))){
         for(String l:list){
             bw.write(l);
             bw.newLine();
         }
        }
        catch(Exception e){
            System.out.println("error"+e);
        }
    }
}

