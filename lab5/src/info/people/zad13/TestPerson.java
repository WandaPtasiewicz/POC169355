package info.people.zad13;

public class TestPerson {
    public static void main(String[] args) {
        Person p1= new Person("Ania","Lolek","fiołkowa 3",12);
        System.out.println(p1.introduceYourself());
        p1.setAge(23);
        p1.setFirstName("Kasia");
        p1.setAddress("makowa 12");
        p1.setLastName("lola");
        System.out.println(p1.getAge());
        System.out.println(p1.getAddress());
        System.out.println(p1.getFirstName());
        System.out.println(p1.getLastName());
    }
}
