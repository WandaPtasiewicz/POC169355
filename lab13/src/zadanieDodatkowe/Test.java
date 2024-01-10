package zadanieDodatkowe;

public class Test
{
	public static void main(String[] args)
	{
		String a=null;
		String b="mas";
		String c=null;
		System.out.println(areBothNull(a,b));
		System.out.println(areBothNull(a,c));

	}
	public static <T extends Comparable<T>> boolean areBothNull(T a, T b){
		if(a==null && b==null){
			return true;
		}
		return false;
	}

}
