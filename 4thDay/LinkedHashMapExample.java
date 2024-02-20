import java.util.*;
public class LinkedHashMapExample{
    public static void main(String args[]){
         LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
         map.put("Two",2);
         map.put("Three",3);
         map.put("One",1);
        System.out.println("LnikedHashMap :"+map);
        // String str = map.get("AP");
        map.putIfAbsent("Six",6);
         System.out.println(" updated LnikedHashMap :"+map);
         LinkedHashMap<String,Integer> num = new LinkedHashMap<>(map);
         num.put("five",5);
         num.put("seven",7);
         num.putAll(map);
         System.out.println(" updated LnikedHashMap :"+num);
         System.out.println("")






        // System.out.println("Value of key AP :"+str);
        // System.out.println("keys :"+map.keySet());
        // System.out.println("Values :"+ map.values());
        // System.out.println("Key-Values Mappings :"+map.entrySet());
        // map.replace("UP","Uttar Pradesh");
        // System.out.println("HashMap using replace() :"+map);
        // String removedEntry = map.remove("UP");
        // System.out.println("removed Entry :"+removedEntry);
        // System.out.println("First Number :"+ tree.first());
        // System.out.println("last Number :"+ tree.last());
        // System.out.println("Removed numbers :"+ tree.removed(4));
    } 
}