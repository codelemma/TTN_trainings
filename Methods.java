import java.util.*;
class Methods{
    int max(int x,int y){
        if(x>y)
        return x;
        else
        return y;
    }
}
public class Main(){
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int n = sc.nextInt();
        System.out.println("Enter the Second number");
        int m = sc.nextInt();
        Methods m = new Methods();
        System.out.println(m.max(n,m));
    }
}
