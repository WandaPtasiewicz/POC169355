package Pacjent;
public class Patient {
    public int patientId;
    public String name;
    public int age;
    public Patient(int patientId, String name, int age){
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString(){
        return "Id: " + patientId + ", Name: " + name + ", Age: " + age;
    }
    public int getPatientId(){
        return patientId;
    }

    public int getAge(){
        return age;
    }


}
