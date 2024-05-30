import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("mike", 100);
        map.put("popeye", 101);
        map.put("Goku", 102);
        
        System.out.println(map);
        System.out.println(map.get("mike"));
        System.out.println(map.containsKey("sailormoon"));
        System.out.println(map.containsValue(102));
        
        for (Map.Entry<String, Integer> m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
