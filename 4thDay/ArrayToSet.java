import java.util.*;
public class ArrayToSet{
    public static void main(String args[]){
       
        Integer [] arr = {10,90,30,80,40,70,50};
         Set<Integer> tree = new TreeSet<Integer>(Arrays.asList(arr));
        System.out.println("Array to Set:"+ tree);
        // System.out.println("First Number :"+ tree.first());
        // System.out.println("last Number :"+ tree.last());
        // System.out.println("Removed numbers :"+ tree.removed(4));
    } 
}