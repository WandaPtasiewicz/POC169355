package Kol1.zad3;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        Student s1= new Student("Kasia",1.34f);
        Student s2= new Student("Basia",5.00f);
        Student s3= new Student("Iwona",2.99f);
        Student s4= new Student("Emil",3.56f);
        Student s5= new Student("Emil",4.56f);
        Student[]tab={s1,s2,s3,s4,s5};
        System.out.println(findMedian(tab).toString());
    }
    public static <T extends Comparable<T>>T findMedian(T[]tab){
        if(tab == null ||tab.length==0){
            return null;
        }
        Arrays.sort(tab);
        return tab[tab.length/2];

    }
}
