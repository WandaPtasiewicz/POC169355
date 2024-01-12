package Kol3.zad4;

import java.util.Collection;
import java.util.Iterator;

public class Utilities {

   public static <E> void printEverySecond(Collection<E>items){
       boolean canPrint=false;
        Iterator<E> iterator= items.iterator();
        while (iterator.hasNext()){
            E item=iterator.next();
            if(canPrint){
                System.out.println(item);
            }
            canPrint=!canPrint;
        }

    }
}
