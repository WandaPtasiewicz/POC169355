package Pacjent;

import java.util.Comparator;

class AgeComparator implements Comparator<Patient>{
    @Override
    public int compare(Patient p1, Patient p2){
        return Integer.compare(p1.getAge(), p2.getAge());
    }
}
