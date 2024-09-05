import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
class Countt{
    public static void main(String[]args){
        HashMap<String,Integer> h=new HashMap<>();
        String path="/home/lakshmi/Desktop/Upper.txt";
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
        catch(Exception e){
            System.out.println("error"+e);
        }
        for(Map.Entry<String,Integer> m:h.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
