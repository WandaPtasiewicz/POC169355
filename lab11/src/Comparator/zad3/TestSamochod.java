package Comparator.zad3;

import java.util.Arrays;

public class TestSamochod {
    public static void main(String[] args) {
        //Samochod[]tab=new Samochod[5];
        Samochod s1=new Samochod("toyota",1999,233334.00);
        Samochod s2=new Samochod("mercedes",1999,26556.00);
        Samochod s3=new Samochod("audi",2002,23999.00);
        Samochod s4=new Samochod("honda",1889,234994.00);
        Samochod s5=new Samochod("kia",1998,234444.00);
        Samochod [] tablica={s1,s2,s3,s4,s5};
        for(var el: tablica){
            System.out.println(el.toString());
        }
        Arrays.sort(tablica,new Komparator());
        System.out.println("SORTOWANIE");
        for(var el: tablica){
            System.out.println(el.toString());
        }
    }
}
