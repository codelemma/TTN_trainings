/*
Q2) Write a program to read user input until user writes XDONE 
  and then show the entered text by the user on commandline
 */
import java.util.Scanner;
public class Quest_2{
     public static void main(String[] args)
    {
        System.out.println("Enter the input ");// in string format
        StringBuilder str =  new StringBuilder();
        Scanner sc = new Scanner(System.in);
        String exit = "XDONE";
        while(true){
            String input = sc.next();
            if(input.equals(exit)){
                break;
            }else{
                str.append(input);
            }
            str.append(" ");
        }
        System.out.println("The entire input was : " + str);

    }
}
