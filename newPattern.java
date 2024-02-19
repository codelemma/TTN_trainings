import java.util.*;
public class newPattern{
    /**
1 2 3 4 5 
  2 3 4 5 
    3 4 5 
      4 5 
        5
     */
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j>=i){
                System.out.print(j+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}