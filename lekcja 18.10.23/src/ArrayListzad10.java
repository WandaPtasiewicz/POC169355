import java.util.ArrayList;
public class ArrayListzad10 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i=0;i<10;i++){
            list1.add(i);
        }
        System.out.println(list1);
        list2 = (copyArray(list1));
        System.out.println(list2);
    }
    public static ArrayList<Integer> copyArray (ArrayList<Integer>list1){
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i=0;i<list1.size();i++){
            list2.add(list1.get(i));
        }
        return list2;
    }
}
