import java.util.*;
public class ArrayList1{
    public static void main(String args[]){
        ArrayList<Integer> l = new ArrayList<Integer>();
        for(int i=1;i<=100;i++){
          l.add(i);
          }
          System.out.print(l);
          for(int i=1;i<=100;i++){
            if(i%7==0)
            l.remove(l.indexOf(i);
          }
          System.out.println("The Seprated ArrayList is :");
          System.out.print(l);
    }
}