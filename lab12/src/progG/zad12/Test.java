package progG.zad12;

import java.util.Arrays;

public class Test {
    public static  void main(String[] args) {
        Integer[]tab={1,2,3,4,5,6,7,8,9};
        swap(tab,1,6);
        System.out.println(Arrays.toString(tab));

    }
    public static <T> void swap(T[]tab,int a,int b){
        T pom=tab[a];
        if( a>=tab.length || b>=tab.length){

        }else{
            tab[a]=tab[b];
            tab[b]=pom;
        }
    }
}
