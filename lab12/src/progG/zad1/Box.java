package progG.zad1;

public class Box<T> {
    private T element;
    public void set(T element){
        this.element= element;
    }
    public T get(){
        return element;
    }

    @Override
    public String toString() {
        return "Box{" +
                "element=" + element +
                '}';
    }

    public Box(T element) {
        this.element = element;
    }
}
