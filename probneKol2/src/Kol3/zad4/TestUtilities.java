package Kol3.zad4;

import java.util.ArrayList;
import java.util.HashSet;

public class TestUtilities {
    public static void main(String[] args) {
        ArrayList<String>l1=new ArrayList<>();
        l1.add("aa");
        l1.add("bb");
        l1.add("aa");
        l1.add("bb");
        l1.add("aa");
        l1.add("bb");
        HashSet<Integer> s1 =new HashSet<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(4);
        s1.add(5);
        s1.add(6);
        Utilities.printEverySecond(s1);
        Utilities.printEverySecond(l1);
    }
}
