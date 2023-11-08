package pl.weather.zad23;

import java.util.ArrayList;

class TemperatureHistory {
    private ArrayList <Double>temperatures;

    public TemperatureHistory(){

    }

    public ArrayList<Double> getTemperatures() {
        return temperatures;
    }

    public void setTemperatures(ArrayList<Double> temperatures) {
        this.temperatures = temperatures;
    }

    public void addTemperature(Double temperature){
        this.temperatures.add(temperature);
    }
    public void removeTemperature(int index){
        this.temperatures.remove(index);
    }

}
