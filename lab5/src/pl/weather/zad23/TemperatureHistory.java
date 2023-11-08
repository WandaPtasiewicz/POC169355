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
    public Double averageResult(){
        double wynik=0;
        for(int i=0;i<this.temperatures.size()-1;i++){
            wynik+=this.temperatures.get(i);
        }
        return wynik/this.temperatures.size();
    }

}
