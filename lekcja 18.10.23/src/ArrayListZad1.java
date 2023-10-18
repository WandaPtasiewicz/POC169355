import java.util.ArrayList;
import java.util.Collections;
public class ArrayListZad1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(i);
        }
        Collections.reverse(list);
        System.out.println(list);
    }
}
