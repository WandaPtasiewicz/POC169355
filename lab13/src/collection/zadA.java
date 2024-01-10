package collection;

import java.util.*;

public class zadA
{
	public static void main(String[] args)
	{
		ArrayList<String>list=new ArrayList<>();
		list.add("Jabłko");
		list.add("Jabłko");
		list.add("Jabłko");
		list.add("Cytryna");
		list.add("Granat");
		list.add("Jabłko");
		list.add("Jabłko");
		prineUniqu(list);
		System.out.println(countOccurrences(list,"Jabłko"));
		removeEveryOther(list);
		System.out.println(list);
	}
	public static <T> void prineUniqu(Collection<T>iteams){
		HashSet<T>temp=new HashSet<>(iteams);
		for(var el:temp){
			System.out.println(el);
		}
	}
	public static <T> int countOccurrences(Collection<T>iteams,T element){
		int wynik=0;
		for(var el:iteams){
			if(el.equals(element)){
				wynik++;
			}

		}
		return wynik;
	}
	public static <T>void removeEveryOther(Collection<T>iteams){
		boolean canD=false;
		Iterator<T>iterator=iteams.iterator();
		while (iterator.hasNext()){
			T item=iterator.next();
			if (canD)
			{
				iterator.remove();
			}
			canD=!canD;
		}
	}
}
