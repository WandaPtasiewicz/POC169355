package pl.weather.zad23;

import java.util.Arrays;

class TestTemperatureHistory {
    public static void main(String[] args) {
        TemperatureHistory t1= new TemperatureHistory();
        t1.addTemperature(3.5);
        t1.addTemperature(342.5);
        t1.addTemperature(1.5);
        t1.addTemperature(36.5);
        t1.addTemperature(30.5);
        t1.removeTemperature(2);
        System.out.println(t1.averageResult());

    }
}
