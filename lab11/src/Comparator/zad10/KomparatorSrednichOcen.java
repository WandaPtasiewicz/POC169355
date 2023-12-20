package Comparator.zad10;

import Comparator.zad3.Samochod;

import java.util.Comparator;

public class KomparatorSrednichOcen implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int result= Double.compare(o2.getAverageGrade(),o1.getAverageGrade());
        if(result !=0){
            return result;
        }
        result=o1.getName().compareTo(o2.getName());
        return result;
    }
}
