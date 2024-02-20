import java.util.*;
public class IterateThroughMaps{
    public static void main(String args[]){
         Map<String,Integer> map = new HashMap<>();
         map.put("Abhishek",22);
         map.put("Vaibhav",163);
         map.put("Maurya",69);
         map.put("Mishra",203);
        System.out.println("HashMap :"+map);
        System.out.println("\nKeys");
        for(String key : map.keySet()){
            System.out.print(key+", ");
        }
        System.out.println("\nValues");
        for(Integer value : map.values()){
            System.out.print(value+", ");
        }
        System.out.println("\nEntries");
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.print(entry+", ");
        }
    }
}
