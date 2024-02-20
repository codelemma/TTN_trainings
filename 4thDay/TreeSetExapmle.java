import java.util.*;
public class TreeSetExample{
    public static void main(String args[]){
        Set<Integer> tree = new TreeSet();
        tree.add(6);
        tree.add(2);
        tree.add(9);
        tree.add(4);
        tree.add(7);
        tree.add(11);
        System.out.println("treeSet :"+tree);
        System.out.println("First Number :"+ tree.first());
        System.out.println("last Number :"+ tree.last());
        System.out.println("Removed numbers :"+ tree.removed(4));
    } 
}