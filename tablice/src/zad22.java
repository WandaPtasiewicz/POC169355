import java.util.Arrays;
public class zad22 {
    public static void main(String[] args) {
        int[] tablica = {1,2,3,4,5};
        System.out.println(Arrays.toString(tablica));
        int[]tab2=copyArrayWithIndex(tablica,1,3);
        System.out.println(Arrays.toString(tab2));
    }
    public static int[] copyArrayWithIndex(int[]tab,int a, int b){
        int[]tab2=Arrays.copyOfRange(tab,a,b+1);


        return tab2;
    }
}
