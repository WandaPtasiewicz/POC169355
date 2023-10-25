public class TestCat {
	public static void main(String[] args)
	{
		Cat c1 = new Cat();
		c1=c1.createCat("Emil");
		System.out.println(c1.name);
		c1=c1.createCat(null);
		System.out.println(c1.name);
	}
}
	class Cat{
		String name;

		public Cat createCat(String name){
			Cat c1 = new Cat();
			if(name !=null){
				c1.name= name;
			}else{
				return null;
			}

			return c1;
		}
	}
