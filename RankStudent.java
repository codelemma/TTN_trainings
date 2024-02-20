import java.util.*;


public class RankStudent {
    public static void main(String[] args) {
        Map<String, Integer> scores = new TreeMap<>();// Sorted Map
        scores.put("Alice", 85);
        scores.put("Bob", 90);
        scores.put("Charlie", 80);
        Integer max = 0;
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            if(entry.getValue() >= max){
                max = entry.getValue();
            }
        }
        
    }
}
