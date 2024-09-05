import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class Namesort {
    public static void main(String[] args) {
        HashMap<String,Long>customer=new HashMap<>();
        customer.put("GaniLakshmi",9908265696L);
        customer.put("Abhilash",9177060775L);
        customer.put("veeramani",9573610439L);
        customer.put("veerraju",6301129108L);
        TreeMap<String,Long>sorted=new TreeMap<>(customer);
        for(Map.Entry<String,Long>entry:sorted.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
