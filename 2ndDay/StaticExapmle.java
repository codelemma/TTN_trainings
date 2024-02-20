import java.util.*;
class Bank{
    Static int balance;
     int AccountNum;
    static float getBalance(){
        float bal = 100;
        return bal;
        }
        int setAccount(){
            int AccountNum = 123;
            return AccountNum;
        }
}
public class StaticExample{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Bank b = new Bank();
        // System.out.println(b.balance);
        System.out.println("The balance is : "+ b.balance);
        System.out.println("The interest is :"+b.getBalance());
        System.out.println("Enter the Acc Number");
        b.AccountNum = sc.nextInt();
        System.out.println("The interest is :"+b.setAccount());
    }
}