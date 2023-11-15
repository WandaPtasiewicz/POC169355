package pl.edu.uwm.zad3;

 class Tool {
    String name;
     protected Tool(String name){
        this.name=name;
     }
}

class Hammer extends Tool{

     protected Hammer(String name){
         super(name);
     }
}
