package Interfejsy.Comparable.zad18;

import java.util.ArrayList;

public class MovieTest {
    public static void main(String[] args) {
        Movie m1 = new Movie("bolek i lolek","rezyser","bajka");
        Movie m2 = new Movie("smerfy","rezyser","bajka");
        Movie m3 = new Movie("władca pierscieni","rezyser","romans");
        Movie m4 = new Movie("harrt potter","rezyser","fantasy");
        ArrayList<Movie>lista = new ArrayList<>();
        lista.add(m1);
        lista.add(m2);
        lista.add(m3);
        lista.add(m4);
        for(int i=0;i<lista.size();i++){
            System.out.println(lista.get(i).toString());
        }
        lista.sort(null);
        System.out.println("sortowanie: ");
        for(int i=0;i<lista.size();i++){
            System.out.println(lista.get(i).toString());
        }

    }
}
