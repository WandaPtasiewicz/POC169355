package linkedList;

import java.util.HashSet;
import java.util.LinkedList;

public class zadD
{
	public static void main(String[] args)
	{
	LinkedList<Integer>a=new LinkedList<>();
	LinkedList<Integer>b=new LinkedList<>();
	a.add(1);
	a.add(2);
	a.add(1);
	a.add(2);
	a.add(1);
		System.out.println(isPalindrom(a));
		System.out.println(a);
	b.add(2);
	b.add(1);
	b.add(2);
	b.add(4);
	b.add(5);
		System.out.println(findCommonElements(a,b));
	}
	public static <T> boolean isPalindrom(LinkedList<T>linkedList){
		return linkedList.equals(linkedList.reversed());
	}
	public static <T> LinkedList<T>findCommonElements(LinkedList<T>A,LinkedList<T>B){
		LinkedList<T>result=new LinkedList<>();
			for (var el:A)
			{
				if(B.contains(el)){
					result.add(el);
			}
		}
		HashSet<T>temp=new HashSet<>(result);
		result.clear();
		result.addAll(temp);
		return result;
	}
}


