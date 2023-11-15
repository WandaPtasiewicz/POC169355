package pl.edu.uwm.akt6;

 class Laptop {
     private String brand;
     private int yearReleased;
     private Double price;

     Laptop(String brand,int yearReleased,double price){
         this.brand=brand;
         this.yearReleased=yearReleased;
         this.price=price;
     }

     @Override
     public String toString(){
        return "Laptop. Marka: "+brand+", rok wydania "+yearReleased+", cena: "+price+".";
     }
}
