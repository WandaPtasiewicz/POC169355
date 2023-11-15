package pl.edu.uwm.a1;

 abstract class WorkTool {
     String name;
     int productionYear;


     public abstract void use ();

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }
 }
class Hammer extends WorkTool{
    @Override
    public void use(){
        System.out.println(name+" robi: lala");
    }
}
class Saw extends WorkTool{
    @Override
    public void use(){
        System.out.println(name+" robi: lda");
    }
}
class Screwdriver extends WorkTool{
    @Override
    public void use(){
        System.out.println(name+" robi: dfdsa");
    }

}