package Comparator.zad15;

import Comparator.zad15.Student;

import java.util.ArrayList;

public class TestStudent {
    public static void main(String[] args) {
        ArrayList<Comparator.zad15.Student> list=new ArrayList<>();
        list.add(new Comparator.zad15.Student(1,"Arek",5.4));
        list.add(new Comparator.zad15.Student(2,"Marek",3.4));
        list.add(new Comparator.zad15.Student(3,"Asia",4.3));
        list.add(new Comparator.zad15.Student(4,"Franek",4.4));
        list.add(new Student(5,"Katarzyna",1.4));
        list.sort(new AverageGradeComparator().thenComparing(new IdComparator()));
    }
}
