import java.util.ArrayList;
import java.util.Collections;
public class ArrayListZad1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<10;i++){
            list.add(i);
        }

        //Collections.reverse(list);
        for(int i=9;i>0;i--){
            System.out.println(list.get(i));
        }
    }
}
