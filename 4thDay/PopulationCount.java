import java.util.*;
public class PopulationCount{
    public static void main(String args[]){
         Map<String,Integer> city = new HashMap<>();
         city.put("Delhi",4);
         city.put("Ghaziabad",163);
         
         city.put("Kanpur",22);
         city.put("kolkata",30);
        System.out.println("Cities :"+city.keySet());        
        System.out.println("Population :"+city.values());        
    }
}
