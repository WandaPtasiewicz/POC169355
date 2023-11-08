public class TestLibary
{
	public static void main(String[] args)
	{
		Libary l1 = new Libary();
		l1.setCatalog("dramat");
		System.out.println(l1.getLenght());
	}
}
class Libary {
	private String catalog;

	public void setCatalog(String name){
		catalog=name;
	}

	public int getLenght(){
		return catalog.length();
	}
}
