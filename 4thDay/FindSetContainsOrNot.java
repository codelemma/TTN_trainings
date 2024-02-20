import java.util.*;
public class FindSetContainsOrNot{
    public static void main(String args[]){
        Set<Integer> tree = new HashSet<>();
        tree.add(1);
        tree.add(9);
        tree.add(3);
        tree.add(7);
        tree.add(2);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check");
        int num = sc.nextInt();
        if(tree.contains(num)){
            System.out.println("This number "+num+" exists");
        }else{
             System.out.println("This number "+num+" does not exists");
        }
        Set<Integer> sqSet = new HashSet<>();
        sqSet.add(1);
        sqSet.add(81);
        sqSet.add(9);
        sqSet.add(49);
        sqSet.add(4);
        tree.addAll(sqSet);
        System.out.println("The added numbers set is : "+ tree);
        System.out.println("The added Square set is : "+ sqSet);
        if(tree.conatinsAll(sqSe)){
            System.out.println("Yes s");
        }

    } 
}