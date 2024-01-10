package treeMap;

import java.util.TreeMap;

public class zadL
{
	public static void main(String[] args)
	{

	}
	public <V, K extends Comparable<K>>TreeMap<K,V> subMapInRange(TreeMap<K,V>map,K start,K end){
		TreeMap<K,V>wynik=new TreeMap<>();
		for(var entry:map.entrySet()){
			K key=entry.getKey();
			if(start.compareTo(key)<=0 && end.compareTo(key)<=0){
				wynik.put(key,entry.getValue());
			}
		}
		return wynik;
	}
}
