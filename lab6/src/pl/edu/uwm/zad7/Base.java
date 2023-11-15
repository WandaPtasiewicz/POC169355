package pl.edu.uwm.zad7;

class Base {

    public static void info(){
        System.out.println("This is the base class.");
    }
}
class Child extends Base{

    //@Override
    public static void info(){
        System.out.println("This is the child class.");
    }
}
