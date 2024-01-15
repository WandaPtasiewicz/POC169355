package Kol2.zad3;

import java.util.ArrayList;
import java.util.Comparator;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<Double>a=new ArrayList<Double>();
        ArrayList<Double>b=new ArrayList<Double>();
        a.add(1.23);
        a.add(1.23);
        a.add(1.23);
        a.add(1.23);
        a.add(1.23);
        b.add(3.33);
        b.add(3.33);
        b.add(3.33);
        b.add(3.33);
        b.add(3.33);
        appendFromEnd(a,b);
        System.out.println(b);

    }
    public static<E extends Comparable<? super E>> void appendFromEnd(ArrayList<E>A, ArrayList<E>B){
        B.addAll( A);
    }
}
