import java.util.*;
class Bank{
    int CheckBalance;
     int AccountNum;
public Bank(float bal, int accNum){
    CheckBalance = bal;
    AccountNum = accNum;
}
}
public class ConstructorExample{
    public static void main(String args[]){
        Bank b = new Bank(1000,6789);
        System.out.println("Enter the Balance");
        System.out.println("The interest is :"+b.Interest());
        Sbi j = new Sbi();
        System.out.println("The interest is :"+j.Interest());
    }
}