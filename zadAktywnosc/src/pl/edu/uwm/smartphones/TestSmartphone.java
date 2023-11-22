package pl.edu.uwm.smartphones;

public class TestSmartphone {
    public static void main(String[] args) {
        Smartphone s1= new Smartphone("Samsung");
        Smartphone s2= new Smartphone(new String("Samsung"));
        Smartphone s3= null;
        Smartphone s4= new Smartphone("Samsung");
        Smartphone s5= new Smartphone("IPhone");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s5));
    }
}
