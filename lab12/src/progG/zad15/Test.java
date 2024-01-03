package progG.zad15;

public class Test {
    public static void main(String[] args) {
        Integer[]tab={1,2,3,6,9,1,12,5,-1};
        System.out.println(max(tab));
    }
    public static <T extends Comparable<T>> T max(T[]tab){
        if(tab==null || tab.length==0){
            throw new IllegalArgumentException("pusta tablica");
        }


        T max= tab[0];
        for(int i=0;i<tab.length-1;i++){
            if(tab[i].compareTo(max)>0){
                max=tab[i];
            }
        }

        return max;
    }
}
