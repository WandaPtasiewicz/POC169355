package Wyjatki.zad1;

public class metoda {
    public static int checkAge(int number){
        if(number<18){
            throw new IllegalArgumentException("mniej niz 18");
        }

        return number;
    }
}
