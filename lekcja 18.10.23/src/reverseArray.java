import java.util.ArrayList;
public class reverseArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(i);
        }
        for(int i=0;i<10/2;i++){
            int temp = list.get(i);
            list.set(i,list.size()-1-i);
            list.set(list.size()-1-i,temp);
        }
        System.out.println(list);
    }
}
