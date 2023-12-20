package Comparator.zad3;

import java.util.Comparator;

public class Komparator implements Comparator<Samochod> {
    @Override
    public int compare(Samochod o1, Samochod o2) {
        return Integer.compare(o1.getRokProdukcji(),o2.getRokProdukcji());
    }

}
