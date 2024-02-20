import java.util.*;
public class NavigableSet{
    public static void main(String args[]){
        NavigableSet<Integer> tree = new NavigableSet();
        tree.add(20);
        tree.add(40);
        tree.add(30);
        tree.add(5);
        tree.add(10);
        System.out.println("Elements of Set :"+tree.ceiling());
        System.out.println("First Number :"+ tree.tail());
        System.out.println("last Number :"+ tree.higher());
        System.out.println("Removed numbers :"+ tree.headset(4,true));
        System.out.println("Removed numbers :"+ tree.headset(4,false));
        System.out.println("Removed numbers :"+ tree.tailset(4,true));
        System.out.println("Removed numbers :"+ tree.tailset(4,false));
        System.out.println("Removed numbers :"+ tree.pllFirst());
        System.out.println("Removed numbers :"+ tree.pollLast());
    } 
}