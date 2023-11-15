package pl.edu.uwm.a1;

class TestWorkTool {
    public static void main(String[] args) {
        WorkTool t1= new Hammer();
        WorkTool t2= new Saw();
        t1.setName("macij");
        t2.setName("kon");
        t1.use();
        t2.use();

    }
}
