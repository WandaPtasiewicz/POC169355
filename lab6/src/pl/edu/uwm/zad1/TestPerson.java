package pl.edu.uwm.zad1;

class TestPerson {
    public static void main(String[] args) {

        Person p1 = new Person("adam","kowal",-4);
        Person p2 = new Person("adm","kowal",-4);


        System.out.println(p1.equals(p2));
    }
}
