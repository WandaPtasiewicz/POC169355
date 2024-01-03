package progG.zad4;

public class Triple<T, U, V> {
    private T frist;
    private U second;
    private V third;

    public void setFrist(T frist){
        frist= frist;
    }
    public T getFrist(){
        return frist;
    }
    public void setSecond(U second){
        second=second;
    }
    public U getSecond(){
        return second;
    }

    public void setThird(V third) {
        this.third = third;
    }
    public V getThird(){
        return  third;
    }

    @Override
    public String toString() {
        return "Triple{" +
                "frist=" + frist +
                ", second=" + second +
                ", third=" + third +
                '}';
    }

    public Triple(T frist, U second, V third) {
        this.frist = frist;
        this.second = second;
        this.third = third;
    }
}
