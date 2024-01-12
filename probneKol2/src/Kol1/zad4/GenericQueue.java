package Kol1.zad4;

import java.util.Queue;

public class GenericQueue<T> {
    private Queue<T> queue;


    public void enqueue(T element){
        queue.add(element);
    }
    public T dequeue(){
        return queue.remove();
    }


}
