/* 
Q1) Write a class with FirstName, LastName & age field.
Print Firstname, LastName & age using static block, 
static method & static variable respectively.
 */

public class Quest_1{

    static {//static block
    System.out.println("Abhishek");
    }
    // static method
    static void lastNamePrint(){
        System.out.println("Shukla");
    }
    static int Age=23;  // static variable

    public static void main(String args[]){
        // firstname in the static part will called as the class loads
        lastNamePrint(); // last name from static method
        System.out.println(Age); // static variable
    }
}