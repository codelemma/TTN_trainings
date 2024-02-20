import java.util.*;
public class compareTwoArrays
{
    public static void main(String args[]){
        // System.out.println("Enter the String");
        int arr1D[] = {1,2,3,4,5,6,7};
        int arr2D[] = {1,2,3,4,5,6,7};
        compareArrays(arr1D,arr2D);
}
static void compareArrays(int[]arr1,int[]arr2){
    int comparefactor = 0;
    if(arr1.length==arr2.length){
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i] == arr2[j]){
                    continue;
                }
            }
            if(comparefactor!=0){
            System.out.println("NOT equal");
        }
        }
        if(comparefactor==0){
            System.out.println("equal");
        }
    }
    else{
        System.out.println("The arrays are not equal");
    }
}
}