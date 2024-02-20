import java.util.*;
// import java.util.Collections.*;
public class Collections{
    public static void main(String args[]){
        List<Integer> l = new ArrayList<Integer>(7);
        l.add(1);
        l.add(5);
        l.add(9);
        l.add(7);
        l.add(8);
        l.add(2);
        l.add(3);
        System.out.println(l);
        // for(int i=0;i<l.size();i++){
        //     System.out.print( l.get(i)+" ");
        // }
        // if(l.contains(9)){
        //     System.out.println("Yes Present");
        // }
        // else{
        //     System.out.println("NO");
        // }
        // for(int j=0;j<l.size();j++){
        //     System.out.print(+" "+l.get(j));
        // }
        // for(int i=0;i<l.size();i++){
            // l.add(55);
            // l.set(0,12);
            // l.remove(3);
            // System.out.print(l);
            List<Integer> l2= new ArrayList<Integer>(7);
            l2.add(11);
            l2.add(22);
            l2.add(33);
            l2.add(44);
            l2.add(55);
            l2.add(66);
            l2.add(77);
            System.out.println(l2+" ");
            // Collections.copy(l,l2);
            Collections.sort(l);
            System.out.print(l);
    }
}