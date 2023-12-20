package Kopiowanie.zad11;

public class TestAthlete {
    public static void main(String[] args) {
        double[]tab={12,43.2,12.4,4.4};
        Athlete a1= new Athlete("James",tab);
        Athlete a2=null;
        try {
            a2 = a1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        a1.times[3]=6.4;
        System.out.println(a2.toString());

    }
}
