package Kol5.zad4;

import java.util.ArrayList;
import java.util.Collection;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<Double>lis=new ArrayList<>();
        lis.add(2.44);
        lis.add(2.44);
        lis.add(2.44);
        lis.add(2.44);
        lis.add(2.44);
        lis.add(2.44);
        fillWithDefaulValue(lis,3.33);
        System.out.println(lis);

    }
    public static <T>void fillWithDefaulValue(Collection<T>items,T item){
        if(items==null){
            return;
        }
        int size=items.size();
        items.clear();
        for(int i=0;i<size;i++){
            items.add(item);
        }
    }
}
