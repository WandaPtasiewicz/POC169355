package Kopiowanie.zad17;

public class TestDeveloper {
    public static void main(String[] args) throws CloneNotSupportedException {
        Developer d1= new Developer("maciek",22,25.000);
        Developer d2= null;
        SeniorDevelover d3= new SeniorDevelover("wanda",21,33.55,400);
        SeniorDevelover d4=null;

            d2=d1.clone();
            d4=d3.clone();

        d1.setAge(25);
        System.out.println(d2.getAge());
        d3.setBonus(30);
        System.out.println(d4.getBonus());
    }
}
