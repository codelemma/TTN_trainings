import java.util.*;
public class Intersection{
    public static void main(String args[]){
        Set<Integer> tree = new HashSet<>();
        tree.add(1);tree.add(9);tree.add(3);tree.add(7);tree.add(2);
        Set<Integer> sqSet = new HashSet<>();
        sqSet.add(1);sqSet.add(81);sqSet.add(9);sqSet.add(49);sqSet.add(4);
        System.out.println("The added numbers set is : "+ tree);
        System.out.println("The added Square set is : "+ sqSet);
        tree.retainAll(sqSet);
        System.out.println("After Intersection Common Elements : "+ tree);
        

    } 
}