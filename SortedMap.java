import java.util.*;

public class SortedMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>(); // LinkedHashMap maintains insertion order

        // Adding elements
        map.put("Bob", 90);
        map.put("Alice", 85);
        map.put("Charlie", 80);

        // Displaying elements
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
