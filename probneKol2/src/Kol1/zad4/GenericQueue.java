package Kol1.zad4;

import java.util.LinkedList;
import java.util.Queue;

public class GenericQueue<T> {
    private Queue<T> queue ;

    public GenericQueue(){
            this.queue=new LinkedList<>();
    }
    public void enqueue(T element){

        this.queue.add(element);
    }
    public T dequeue(){
        return queue.remove();
    }

    @Override
    public String toString() {
        return "GenericQueue{" +
                "queue=" + queue +
                '}';
    }
}
