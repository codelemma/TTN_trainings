import java.util.*;
public class EvenLineByLine{
    /** 1 2 3 4 5 2 3 4 5 3 4 5 4 5 5*/
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.print(" ");
            }
            else{
                System.out.print(i+" ");
            }
        }
    }
}