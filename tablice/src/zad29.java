import java.util.Arrays;
public class zad29 {
    public static void main(String[] args) {

        double[]tab1={34,123.43,1,-3,23};
        wypisz(tab1);
        sortArray(tab1);
        System.out.println();
        wypisz(tab1);
        System.out.println(Arrays.toString(tab1));

    }

    public static void sortArray(double[]tab){
        Arrays.sort(tab);

    }
    public static void wypisz(double[]tab){
        for(int i=0;i<tab.length;i++){
            System.out.print(tab[i]);
            System.out.print(", ");
        }
    }
}
