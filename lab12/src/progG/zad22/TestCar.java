package progG.zad22;

public class TestCar {
    public static void main(String[] args) {
        Car c1=new Car();
        Car c2=new Car();
        ElectricCar c3=new ElectricCar();
        System.out.println(Car.compareObjects(c1,c2));
        System.out.println(Car.compareObjects(c1,c3));
    }
}
