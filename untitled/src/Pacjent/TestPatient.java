package Pacjent;
import java.util.ArrayList;
import java.util.List;

public class TestPatient {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        patients.add(new Patient(13,"Wojtek", 43));
        patients.add(new Patient(14,"Adam", 24));
        patients.add(new Patient(15,"Adrian", 24));
        patients.add(new Patient(16,"Justyna", 65));
        patients.add(new Patient(17,"Piotr", 15));

        patients.sort(new AgeComparator().thenComparing(new PatientIdComparator()));

        for(Patient patient : patients){
            System.out.println(patient);
        }
    }
}
