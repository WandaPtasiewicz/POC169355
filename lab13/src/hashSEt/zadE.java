package hashSEt;

import java.util.HashSet;
import java.util.List;

public class zadE
{
	public static void main(String[] args)
	{

	}
	public<T> HashSet<T> findUniqueElements(List<T> list){
		return new HashSet<>(list);
	}
	public <T> boolean hasCommonElements(HashSet<T>A,HashSet<T>B){
		for(var el:A){
			if(B.contains(el)){
				return true;
			}
		}

		return false;
	}
	public <T>HashSet<T>unionSets(HashSet<T>A,HashSet<T>B){
		HashSet<T>wynik=new HashSet<>(A);
		wynik.addAll(B);
		return wynik;
	}
}
