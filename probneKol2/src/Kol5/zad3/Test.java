package Kol5.zad3;

public class Test {
    public static void main(String[] args) {
        Vehicle v1=new Vehicle("volvo",3000);
        Vehicle v2=new Vehicle("volvo",30800);
        compareAndPrint(v1,v2);
    }
    public static <T> void compareAndPrint(T a,T b){
        if(a.equals(b)){
            System.out.println("Są równe");
        }else{
            System.out.println("Nie są równe");
        }

    }
}
