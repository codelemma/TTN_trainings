import java.util.*;
public class CountWords
{
    public static void main(String args[]){
        System.out.println("Enter the String");
        int arr1D[] = {1,2,3,4,5,6,7};
        int arr2D[][] = {{11,22,33},{44,55,66},{77,88,99}};
         meth1D(arr1D);
    meth2D(arr2D);
}


    static void meth1D(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    static void meth2D(int[][] arr){
        for(int i=0;i<arr2D.length;i++){
            for(int j=0;j<arr[0].length;j++){
                system.out.print(arr2D[i][j]);
            }
            System.out.println();
        }
    }
}