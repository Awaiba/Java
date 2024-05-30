import java.util.ArrayList;
import java.util.List;

public class SubListExample {
    public static void main(String[] args) {
        List<String> originalList = new ArrayList<>();
        originalList.add("Apple");
        originalList.add("Banana");
        originalList.add("Orange");
        originalList.add("Grapes");
        originalList.add("Mango");
        List<String> subList = originalList.subList(1, 4);
        System.out.println("Original List:");
        for (String fruit : originalList) {
            System.out.println(fruit);
        }
        System.out.println("\nSubList:");
        for (String fruit : subList) {
            System.out.println(fruit);
        }
    }
}
