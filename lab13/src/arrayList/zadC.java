package arrayList;

import java.util.ArrayList;
import java.util.HashSet;

public class zadC
{
	public static void main(String[] args)
	{
		ArrayList<String>a=new ArrayList<>();
		ArrayList<String>b=new ArrayList<>();
		ArrayList<String>c=new ArrayList<>();
		a.add("raz");
		a.add("dwa");
		a.add("trzy");
		b.add("kotek");
		b.add("piesek");
		b.add("myszka");
		System.out.println(mergeList(a,b));
		c.add("jajko");
		c.add("jajko");
		c.add("jajko");
		c.add("jajko");
		c.add("piłka");
		System.out.println(removeDuplicates(c));
		System.out.println(countOccurrences(c,"jajko"));
	}
	public static <T> ArrayList<T> mergeList(ArrayList<T>A,ArrayList<T>B){
		ArrayList<T>newList=new ArrayList<>(A);
		newList.addAll(B);
		return newList;
	}
	public static <T>ArrayList<T> removeDuplicates(ArrayList<T>list){
		ArrayList<T>newList=new ArrayList<>();

		for(var el:list){
			if(!newList.contains(el)){
				newList.add(el);
			}
		}
		return newList;
	}
	public static <T>int countOccurrences(ArrayList<T>list,T element){
		int wynik=0;
		for(var el:list){
			if(el.equals(element)){
				wynik++;
			}
		}
		return wynik;
	}
}
