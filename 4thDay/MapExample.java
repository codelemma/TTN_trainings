import java.util.*;
public class MapExample{
    public static void main(String args[]){
         HashMap<String,String> map = new HashMap<>();
         map.put("UP","Uttara Pradesh");
         map.put("MP","Madhya Pradesh");
         map.put("AP","Andhra Pradesh");
        System.out.println("HashMap :"+map);
        String str = map.get("AP");
        System.out.println("Value of key AP :"+str);
        System.out.println("keys :"+map.keySet());
        System.out.println("Values :"+ map.values());
        System.out.println("Key-Values Mappings :"+map.entrySet());
        map.replace("UP","Uttar Pradesh");
        System.out.println("HashMap using replace() :"+map);
        String removedEntry = map.remove("UP");
        System.out.println("removed Entry :"+removedEntry);
        // System.out.println("First Number :"+ tree.first());
        // System.out.println("last Number :"+ tree.last());
        // System.out.println("Removed numbers :"+ tree.removed(4));
    } 
}