package pl.weather.zad23;

import java.util.Arrays;

class TestTemperatureHistory {
    public static void main(String[] args) {
        TemperatureHistory t1= new TemperatureHistory();
        t1.addTemperature(1.0);
        t1.addTemperature(2.0);
        t1.addTemperature(2.0);
        t1.addTemperature(1.0);
        t1.addTemperature(2.4);
        System.out.println(t1.getTemperatures());
        t1.removeTemperature(2);
        System.out.println(t1.averageResult());

    }
}
