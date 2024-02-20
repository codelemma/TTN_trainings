import java.util.*;
import java.util.stream.*;
public class FindDuplicates{
    public static void main(String args[]){
       
        Integer [] arr = {1,9,3,8,4,7,5,4,5,9,7,1};
        Set<Integer> tree = new TreeSet<Integer>();
        List<Integer> duplicates = new ArrayList<>();
        System.out.println("Non Duplicates:"+ tree);
        for(int i=0;i<arr.length;i++){
            if(tree.contains(arr[i])){
                duplicates.add(arr[i]);
            }
            else{
                tree.add(arr[i]);
            }
        }
        System.out.println("The Non Duplicates are : "+ tree);
        System.out.println("The Non Duplicates are : "+ duplicates);
    } 
}