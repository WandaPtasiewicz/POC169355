package progG.zad22;

public class Car {
    public static boolean compareObjects(Car c1,Car c2){
        if(c1.getClass()==c2.getClass()){
            return true;
        }
        return false;
    }
}
