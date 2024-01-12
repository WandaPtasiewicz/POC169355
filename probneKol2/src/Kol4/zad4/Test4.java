package Kol4.zad4;

import java.util.HashMap;

public class Test4 {
    public static void main(String[] args) {
        HashMap<String,Integer>h1=new HashMap<>();
        HashMap<String,Integer>h2=new HashMap<>();
        h1.put("raz",2);
        h2.put("raz",7);
        h1.put("dwa",2);
        h2.put("trzy",7);
        h1.put("cztery",10);
        h2.put("piec",20);
        h1.put("fuc",22);
        System.out.println(mergeMaps(h1,h2));
    }
    public static <K,V>HashMap<K,V>mergeMaps(HashMap<K,V>a,HashMap<K,V>b){
        HashMap<K,V>nowaSiatka=new HashMap<>();
        nowaSiatka.putAll(a);
        nowaSiatka.putAll(b);
        return nowaSiatka;
    }
}
