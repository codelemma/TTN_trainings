import java.util.*;
public class SortedMaps{
    public static void main(String args[]){
         Map<String,Integer> emp = new HashMap<>();
         emp.put("Abhishek",4);
         emp.put("Satyam",163);
         emp.put("Daya",186);
         emp.put("Ashutosh",22);
         emp.put("Siddharth",30);
        System.out.println("Cities :"+emp.keySet());// list.sort(Map.Entry.comparingByValue());        
        System.out.println("Population :"+emp.values()); 
        Map<String,Integer> emp = new TreeMap<String,Integer>(emp);
         System.out.println(emp.entrySet());

    }
}
