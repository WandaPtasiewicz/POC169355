package Kol1.zad4;

public class TestQueue {
    public static void main(String[] args) {
        GenericQueue<String> g1= new GenericQueue<>( );
        g1.enqueue("mama");
        g1.enqueue("tata");
        g1.enqueue("gg");
        //g1.dequeue();
        System.out.println(g1);
    }
}
