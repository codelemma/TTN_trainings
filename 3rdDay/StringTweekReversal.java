import java.util.*;
public class StringTweekReversal{
    public static void main(String args[]){
        System.out.println("Enter the String");
        Scanner sc =  new Scanner(System.in) ;
        String input = sc.nextLine();
        // StringBuilder str = new StringBuilder(input);
        // for(int i=0;i<str.length()-1;i++)
        // str.append(input.charAt[i]);
        String[] arr = input.split(" ");
        StringBuilder str = new StringBuilder();
           for(int i=0;i<arr.length;i++){
            str.append(new StringBuilder(arr[i]).reverse()).append(" ");
           }
        // str.reverse();
 
        System.out.println(str);
    }
}