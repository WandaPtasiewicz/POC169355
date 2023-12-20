package Kopiowanie.zad2;

public class TestTeacher {
    public static void main(String[] args) {
        Teacher t1= new Teacher("maciek","angielski",10);
        Teacher t3=t1;
        Teacher t2=null;
        try {
            t2 = t1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        t1.setExperience(2);
        System.out.println(t2.getExperience());
    }
}
