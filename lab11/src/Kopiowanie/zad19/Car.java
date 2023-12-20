package Kopiowanie.zad19;

public class Car implements Cloneable{
    private String marka;
    private String model;
    private Engine engine;

    public Car(String marka, String model, Engine engine) {
        this.marka = marka;
        this.model = model;
        this.engine = engine;
    }

    @Override
    protected Car clone() throws CloneNotSupportedException {
        return (Car)super.clone();
    }
}
