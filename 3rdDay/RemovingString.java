import java.util.*;
public class RemovingString{
    public static void main(String args[]){
        ArrayList<String> l = new ArrayList<String>();
        for(Character i='a';i<='z';i++){
          l.add(i.toString());
          }
          System.out.print(l);
          int count=0;
          for(Character i='a';i<='z';i++){
            count++;
            if(count%7==0){
                l.remove(l.get(i));
            }
          }
          System.out.println("The Seprated ArrayList is :");
          System.out.print(l);
    }
}