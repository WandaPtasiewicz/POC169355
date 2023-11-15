package pl.edu.uwm.zad11;

 class Building {
     public int height;
     public String color;

     public Building(){

     }
     public Building(int height,String color){
            this.color=color;
            this.height= height;
     }
}

class House extends Building{
      private int rooms;

      House(int height,String color,int rooms){
          super(height, color);
          this.rooms=rooms;
      }


}
