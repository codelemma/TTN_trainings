import java.util.*;
abstract class Bank{
    abstract int CheckBalance();
    abstract float Interest();
    int duration(){
        int start = 2;
        int end = 3;
        int tenure = end - start;
        return tenure;
    }
}
class Sbi extends Bank{ 
     int CheckBalance()
    {
        int bal = 1000;// obtained after internal fetching
        // System.out.println("Your Account bal is : "+ bal);
        return bal;
    }
    private float balanceSbi=CheckBalance();
    float Interest(){
        float pri = balanceSbi;
        int time = duration();
        float i = (pri*8*time)/100;
        return i;
    }
}
class Icici extends Bank{
    int CheckBalance()
    {
        int bal = 2000;// obtained after internal fetching
        // System.out.println("Your Account bal is : "+ bal);
        return bal;
    }
    private float balanceIcici = CheckBalance();
    float userBalance;
    float Interest(){
        float pri = userBalance;
        int time = duration();
        int rate = 10;
        float i = (pri*rate*time)/100;
        return i;
    }
}
public class OppsExample{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Icici i = new Icici();
        System.out.println("Enter the Balance");
        i.userBalance = sc.nextFloat();
        System.out.println("The interest is :"+i.Interest());
        Sbi j = new Sbi();
        System.out.println("The interest is :"+j.Interest());
    }
}