import java.util.*;

public class DuplicatesInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 3, 5, 6, 7, 7};
        Set<Integer> duplicates = new HashSet<>();
        Set<Integer> uniqueElements = new HashSet<>();

        for (int num : arr) {
            if (!uniqueElements.contains(num)) {
               uniqueElements.add(num);
            }
            else{
                duplicates.add(num);
            }
        }

        System.out.println("Duplicate elements: " + duplicates);
    }
}
