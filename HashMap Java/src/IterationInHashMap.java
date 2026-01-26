import java.util.HashMap;
import java.util.Map;

public class IterationInHashMap {
    static void main() {
        HashMap<String, Integer> map =  new HashMap<>();

        //Insertion
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);
        //for(int val : arr)

        for(Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }
}
