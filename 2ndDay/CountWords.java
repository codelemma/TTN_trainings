import java.util.*;
public class CountWords
{
    public static void main(String args[]){
        System.out.println("Enter the String");
        Scanner sc =  new Scanner(System.in) ;
        String input = sc.nextLine();

        // StringBuilder str = new StringBuilder(input);

        String [] strNew = input.split(" ");
        int len =  strNew.length; 
        System.out.println(len);


        // Try it by string Tokeniser;

    }
}