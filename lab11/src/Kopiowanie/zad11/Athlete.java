package Kopiowanie.zad11;

import java.util.Arrays;

public class Athlete implements Cloneable{
    private String name;
    public double[]times;

    @Override
    protected Athlete clone() throws CloneNotSupportedException {
        Athlete Athlete= (Athlete )super.clone();
        Athlete.times=times.clone();

        return Athlete;
    }

    public Athlete(String name, double[] times) {
        this.name = name;
        this.times = times;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "name='" + name + '\'' +
                ", times=" + Arrays.toString(times) +
                '}';
    }
}
