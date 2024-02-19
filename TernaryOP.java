import java.util.*;
public class TernaryOP{
    /** 1 2 3 4 5 2 3 4 5 3 4 5 4 5 5*/
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        String str = n%2 == 0 ? "The number is even" : "The number is odd";
        System.out.println(str);
    }
}