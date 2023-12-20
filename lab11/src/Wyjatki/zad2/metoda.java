package Wyjatki.zad2;

public class metoda {
    public static double dzielenie(int a, int b){
        if(b==0){
            throw new ArithmeticException("nie mozna dzielic przez zero");
        }
        //zrobic bład gdy zmienna nie jest liczba i zad 3

        return a/b;
    }
}
