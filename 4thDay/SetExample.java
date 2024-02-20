import java.util.*;
public class SetExample{
    public static void main(String args[]){
        Set<Integer> even = new HashSet<>();
        even.add(2);
        even.add(4);
        even.add(6);
        even.add(8);
        System.out.println("HashSet :"+even);
    
    Set<Integer> num = new HashSet<>();
    num.addAll(even);
    num.add(51);
    System.out.println("New HashSet :"+num);
    System.out.println("Is new Hashset contains even numbers? :"+ num.containsAll(even));
    System.out.println("Size of the HashSet :"+num.size());
    System.out.println("HashSet conatins 12 :"+num.contains(12));
    System.out.println("Verify HashSet isEmpty :"+num.isEmpty());
    }
}