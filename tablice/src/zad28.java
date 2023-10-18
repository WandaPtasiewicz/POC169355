import java.util.Arrays;
    public class zad28 {
    public static void main(String[] args) {
        double[] tablica = {1,2,3,4,5};
        wypisz(tablica);
        double[]tab2=coppyArray(tablica);
        System.out.println();

        wypisz(tab2);
    }
    public static double[] coppyArray(double[]tab ){

        double[]tab2 =Arrays.copyOf(tab,tab.length);
        return tab2;
    }
    public static void wypisz(double[]tab){
        for(int i=0;i<tab.length;i++){
            System.out.print(tab[i]);
        }
    }
}
