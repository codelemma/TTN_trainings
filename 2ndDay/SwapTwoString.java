import java.util.*;
public class SwapTwoString
{
    public static void main(String args[]){
        System.out.println("Enter the first String");
        Scanner sc =  new Scanner(System.in) ;
        StringBuilder input1 = sc.next();
        System.out.println("Enter the second String");
        StringBuilder input2 = sc.next();
        int max = input1.length() > input2.length() ? input1.length():input2.length();

       for(int i=0;i<max;i++){
        char str;
        str = input1.charAt(i);
        input1.append(input2.charAt(i))
        input2.append(input1.charAt(i))
        input2.charAt(i) = str;
       }
       System.out.println("Enter the first String"+ input1);
       System.out.println("Enter the second String"+ input2);
        // Try it by string Tokeniser;

    }
}
// India         Bangladesh
// length =5     length = 10
// max = 10;
// India 