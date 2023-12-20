package Wyjatki.zad1;
import static Wyjatki.zad1.metoda.checkAge;
public class zad1 {
    public static void main(String[] args) {
        try {
            System.out.println(  checkAge(50));
            System.out.println( checkAge(-100));
        } catch (IllegalArgumentException e) {
            System.out.println("Wystąpił błąd: " + e.getMessage());
        }
    }
}
