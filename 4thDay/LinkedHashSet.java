import java.util.*;
public class LinkedHashSet{
    public static void main(String args[]){
        Set<Integer> even = new LinkedHashSet();
        even.add(2);
        even.add(4);
        even.add(6);
        even.add(8);
        System.out.println("HashSet :"+even);
    
    Set<Integer> prime = new LinkedHashSet();
    prime.add(2);
    prime.add(3);
    prime.add(5);
    Set<Integer> numbers = new LinkedHashSet();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    numbers.add(5);
    even.removeAll(prime);
    System.out.println("After Difference :"+even);
    prime.retainAll(even);
    System.out.println("After intersection :"+prime);
    numbers.addAll(prime);
    System.out.println("After Union "+ numbers);
    // System.out.println("Size of the HashSet :"+num.size());
    // System.out.println("HashSet conatins 12 :"+num.contains(12));
    // System.out.println("Verify HashSet isEmpty :"+num.isEmpty());
    }
}