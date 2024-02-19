import java.util.*;
public class EvenSwitch{
    /** 1 2 3 4 5 2 3 4 5 3 4 5 4 5 5*/
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum = (n*(n+1))/2c;
        System.out.println("The Sum is "+sum);
    }
}