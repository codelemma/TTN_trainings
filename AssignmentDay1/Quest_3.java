/*
Write a java program to show following menu to the user:
*******Menu*******
1. Calculate Area of Circle
2. Calculate Circumference of a Circle
3. Exit.
Choose an option (1-3): 
Take radius as user input.
Hint: Use Switch statement to act on the menu. Also area and circumference methods should be static
 */
import java.util.*;
public class Quest_3{
    public static void main(String args[]){
        System.out.println("*******Menu*******");
        Scanner sc =  new Scanner(System.in);
        System.out.println("1. Calculate Area of The Circle");
        System.out.println("2. Calculate Cricumference of The Circle");
        System.out.println("3. Exit");
        int input = sc.nextInt();
        switch(input){
            case 1: { System.out.println("Enter the radius of the circle");
            double radius = sc.nextInt();
            System.out.println("The area of the circle is : "+ area(radius)+ " sq units");break;}
            case 2: {System.out.println("Enter the radius of the circle");
            double radius = sc.nextInt();
            System.out.println("The circumference of the circle is : "+ circum(radius)+" unit");break;}
            case 3: {System.exit(0);break;} 
        }
    }
    static double area(double radius){
        return 3.1416*radius*radius;
    }
    static double circum(double radius){
        return 2*(3.1416)*radius;
    }
}