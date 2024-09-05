import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class MapsCustomer {
    public static void main(String[] args) {
        HashMap<Long,String> customer = new HashMap<>();
        customer.put(9908265696L,"Lakshmi");
        customer.put(9177060775L,"Abhilash");
        customer.put(9573610439L,"veeramani");
        customer.put(6301129108L,"veerraju");
        TreeMap<Long,String> sorted = new TreeMap<>(customer);
        for(Map.Entry<Long,String>entry:sorted.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
}
