package Kol4.zad3;

public class Test3 {
    public static void main(String[] args) {
        String[]tab={"lala","dd"};
        creteArray("a","b",tab);
    }
    public static <T extends Comparable<T>> void creteArray(T a, T b,T[]tab){
        if (tab.length != 2) {
            return;
        }

    }
}
