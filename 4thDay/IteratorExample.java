import java.util.ArrayList;
import java.util.Iterator;
public class IteratorExample{
    public static void main(String args[]){
        ArrayList<Integer> t = new ArrayList<Integer>();
        t.add(20);
        t.add(40);
        t.add(30);
        t.add(5);
        t.add(10);
        Iterator<Integer> i = t.iterator();// Iterator<String> it = cars.iterator();
while(i.hasNext()){
            System.out.print(" "+i.next());}
        // System.out.println("Elements of Set :"+tree.ceiling());
        // System.out.println("First Number :"+ tree.tail());
        // System.out.println("last Number :"+ tree.higher());
        // System.out.println("Removed numbers :"+ tree.headset(4,true));
        // System.out.println("Removed numbers :"+ tree.headset(4,false));
        // System.out.println("Removed numbers :"+ tree.tailset(4,true));
        // System.out.println("Removed numbers :"+ tree.tailset(4,false));
        // System.out.println("Removed numbers :"+ tree.pllFirst());
        // System.out.println("Removed numbers :"+ tree.pollLast());
        // Integer[] str = new Integer[tree.size()];
        // tree.toArray(str);
        // System.out.println("Set to Array :"+ str.toString());
    } 
}