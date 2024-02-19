import java.util.*;
/*
Write a Java program to create a class called "Rectangle"
with width and height attributes.
Calculate the area and perimeter of the rectangle.
*/
class Rect{
    int length;    
    int breadth;    
}
public class Rectangle {
public static void main(String args[]){
        Rect r = new Rect();
        System.out.println("Enter the length");
        r.length = sc.nextInt();
        System.out.println("Enter the breadth");
        r.breadth = sc.nextInt();
        int Area = area(r.length,r.breadth);
        int Perimeter = perimeter(r.length,r.breadth);
        System.out.println("Area is: "+Area +"\n"+ "Perimeter is: "+Perimeter);
        sc.close();
    }
    static int area(int l,int b){
        return l*b;
    }
    static int perimeter(int l,int b){
        return 2*(l+b);
    }
}