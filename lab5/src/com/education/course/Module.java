package com.education.course;

class Module {
    private int points;

    public Module(int points){
        if(points>30) {
            this.points = 30;
        }
        if(points<3){
            this.points=3;
        }
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        if(points>30 || points<3){
            System.out.println("BŁĄD!!! ZŁA WARTOŚĆ");
        }else{
        this.points = points;
    }}
}
