import java.util.Arrays;
public class zad16 {
    public static void main(String[] args) {
        int[] tablica = {1,2,3,4,5};
        wypisz(tablica);
        reverseArray(tablica);
        System.out.println();
        wypisz(tablica);
    }
    public static void reverseArray(int[]tab ){
        for (int i = 0; i < tab.length / 2; i++) {
            int temp = tab[i];
            tab[i] = tab[tab.length - 1 - i];
            tab[tab.length - 1 - i] = temp;
        }
    }
    public static void wypisz(int[]tab){
        for(int i=0;i<tab.length;i++){
            System.out.print(tab[i]);
        }
    }
}
