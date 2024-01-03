package Pacjent;

import java.util.Comparator;

class PatientIdComparator implements Comparator<Patient> {
    @Override
    public int compare(Patient p1, Patient p2){
        return Integer.compare(p2.getPatientId(), p1.getPatientId());
    }
}
