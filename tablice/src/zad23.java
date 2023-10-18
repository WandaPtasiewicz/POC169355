import java.util.Arrays;
public class zad23 {
    public static void main(String[] args) {
        int[]tab1={1,2,3};
        int[]tab2={4,5,6};
        int[]tab3 = mergeArrays(tab1,tab2);
        System.out.println(Arrays.toString(tab3));
    }
    public static int[]mergeArrays(int[]tab1,int[]tab2){
        int tab3[]=new int [tab1.length +tab2.length];
        System.arraycopy(tab1,0,tab3,0,tab1.length);
        System.arraycopy(tab2,0,tab3, tab1.length,tab2.length);

        return tab3;
    }
}
