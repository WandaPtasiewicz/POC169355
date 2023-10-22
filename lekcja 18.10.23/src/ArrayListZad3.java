import java.util.ArrayList;
public class ArrayListZad3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(i);
        }
        list.add(-3);
        System.out.println(list);
        System.out.println("Najmniejsza wartosc listy: "+ minimumValue(list));

    }
    public static int minimumValue(ArrayList<Integer> list){
        int min = list.get(0);
        for(int i=1;i<list.size();i++){
            if(list.get(i)<min){
                min=list.get(i);
            }
        }
        return min;
    }
}
