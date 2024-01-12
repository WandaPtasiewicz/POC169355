package Kol3.zad3;

public class Metoda {
    public <T extends Comparable<T>> T findMax(T a, T b, T c){
        if(a.compareTo(b)>0){
            if(a.compareTo(c)>0){
                return a;
            }
            return c;
        }
        if(b.compareTo(c)>0) return b;
        return c;
    }
}
