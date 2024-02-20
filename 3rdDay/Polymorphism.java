class Polymor {// compile time polymorphism
    static int add(int a,int b){
        return a+b;
    }
    static double add(double x,double y,double z){
        return x+y+z;
    }
}
class newClass extends Polymor{
    static int add(int a,int b,int c,int d){
        System.out.println("This calculation is done by newClass with method Overiding");
        return a+b+c+d;
    }
}
public class Polymorphism{
    public static void main(String args[]){
        System.out.println(Polymor.add(10,20));
        System.out.println(Polymor.add(10.2,20.2,10.2));
        System.out.println(newClass.add(10,4,5,7));
    }
}