/**
 Q4) Create a two dimensional array of integers and display:
          sum of all elements of each column
        sum of all elements of each row
 */
import java.util.*;
public class Quest_4{
    public static void main(String args[]){
        int [][] arr = new int[3][3];
        System.out.println("Enter the array (3X3)");
        Scanner sc =new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The array you entered is :");//    1 2 3 rowsum = 1+2+3 = 6
        for(int i=0;i<arr.length;i++){                   //    4 5 6 rowsum = 4+5+6 = 15
            for(int j=0;j<arr[0].length;j++){            //    7 8 9 rowsum = 7+8+9 = 24
                System.out.print(arr[i][j]+" ");         //  column sum = 1+4+7 = 12
            }                                            //  column sum = 2+5+8 = 15
            System.out.println();                        //  column sum = 3+6+9 = 18
        }                                                 //
        System.out.println("The column sum is :"+colSum(arr,1));
        System.out.println("The column sum is :"+colSum(arr,2));
        System.out.println("The column sum is :"+colSum(arr,3));
        System.out.println("The row sum is :"+rowSum(arr,1));
        System.out.println("The row sum is :"+rowSum(arr,2));
        System.out.println("The row sum is :"+rowSum(arr,3));
    }
    static int rowSum(int[][] arr,int rowNum){// takes a 2D array and the Row Number like 1,2,3
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[rowNum-1][i];
        }
        return sum;
    }
    static int colSum(int[][] arr,int colNum){// takes a 2D array and the col Number like 1,2,3
        int sum = 0;
        for(int i=0;i<arr[0].length;i++){
            sum = sum + arr[i][colNum-1];
        }
        return sum;
    }
}