import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
public class Wordcount {
    public static void main(String[] args) {
        String path="/home/lakshmi/Desktop/last.txt";
        HashMap<String,Integer>h=new HashMap<String,Integer>();
        try(BufferedReader bf=new BufferedReader(new FileReader(path))){
            String line;
            while((line=bf.readLine())!=null){
                String words[]=line.split("\\W+");
                for(String w:words){
                    if(!w.isEmpty()){
                        h.put(w,h.getOrDefault(w,0)+1);
                    }
                }
            }
    }
    catch(IOException e){
        e.printStackTrace();
    }
    System.out.println("words count is: ");
    for(Map.Entry<String,Integer>entry:h.entrySet()){
        System.out.println(entry.getKey()+":"+entry.getValue());
    }
}
}
