import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();

        hashMap.put("apple", 10);
        hashMap.put("banana", 20);
        hashMap.put("orange", 15);
        System.out.println("Value of 'apple': " + hashMap.get("apple"));
        System.out.println("Contains key 'banana': " + hashMap.containsKey("banana"));
        System.out.println("Contains value 15: " + hashMap.containsValue(15));
        System.out.println("Iterating over the HashMap:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        hashMap.remove("orange");
        System.out.println("After removing 'orange': " + hashMap);
    }
}
