package Wyjatki.zad2;

import java.util.Scanner;

public class metoda {
    public static double dzielenie(int a, int b){
        int a=0;
        int b=0;
        try{
            Scanner input = new Scanner(System.in);
            a = input.nextInt();
            b = input.nextInt();



        }
        if(b==0){
            throw new ArithmeticException("nie mozna dzielic przez zero");
        }
        //zrobic bład gdy zmienna nie jest liczba i zad 3


        return a/b;
    }
}
