package Comparator.zad10;

import java.util.ArrayList;
import java.util.Arrays;

public class TestStudent {
    public static void main(String[] args) {
        ArrayList<Student>list=new ArrayList<>();
        list.add(new Student(1,"Arek",5.4));
        list.add(new Student(2,"Marek",3.4));
        list.add(new Student(3,"Asia",4.3));
        list.add(new Student(4,"Franek",4.4));
        list.add(new Student(5,"Ok",1.4));
        list.sort(new KomparatorSrednichOcen());
        for(var el:list){
            System.out.println(el.toString());
        }
    }
}
