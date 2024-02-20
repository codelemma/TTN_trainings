/**
 Q5) Create a class named Employee with fields firstname,lastname,age and designation. 
The class should: have all types of constructors to initialize the object
class should also have setter methods to update a particular field
Override its toString method to display a meaningful message using all these fields.
 
 */
class Employee {
    String firstName;
    String lastName;
    int age;
    String designation;

     // default constructor
     Employee(){
        System.out.println("Default Constructor is Called");
     }

    // parameterized Constructor
     Employee(String firstName,String lastName,int age,String designation){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.designation = designation;
     }
     void setFirstName(String firstName){
      this.firstName = firstName;
     }
     void setlastName(String lastName){
      this.lastName = lastName;
     }
     void setAge(int age){
      this.age = age;
     }
      void setDesignation(String designation){
      this.designation = designation;
     }

     // copy constructor
     Employee(Employee e){
      this.firstName = e.firstName;
      this.lastName = e.lastName;
      this.age = e.age;
      this.designation = e.designation;
      System.out.println("\nCopy Constructor is called");
     }
}
public class Quest_5{
    public static void main(String args[]){
       Employee e = new Employee();
       Employee e1 = new Employee("Abhishek","Shukla",23,"Quality Engineer Trainee");
       System.out.println("\nMy Name is " + e1.firstName +" "+ e1.lastName+" and Age is " + e1.age+" yrs "+"I'm "+e1.designation);
       System.out.println("After Updation with setter methods");
       e1.setFirstName("Shubham");
       e1.setlastName("Shukla");
       e1.setAge(24);
       e1.setDesignation("Student");
       System.out.println("My Name is " + e1.firstName +" "+ e1.lastName+" and Age is " + e1.age+" yrs "+"I'm "+e1.designation);
       Employee e2 = new Employee(e1);
       System.out.println("After the updation from the copy constructor");
       System.out.println("\nMy Name is " + e1.firstName +" "+ e1.lastName+" and Age is " + e1.age+" yrs "+"I'm "+e1.designation);
      
    }
}