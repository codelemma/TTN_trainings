import java.util.*;
public class StringReversal{
    public static void main(String args[]){
        System.out.println("Enter the String");
        Scanner sc =  new Scanner(System.in) ;
        String input = sc.nextLine();
        StringBuilder str = new StringBuilder(input);
        // for(int i=0;i<str.length()-1;i++)
        // str.append(input.charAt[i]);
        str.reverse();
 
        System.out.println(str);
    }
}