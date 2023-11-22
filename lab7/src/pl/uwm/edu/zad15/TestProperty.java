package pl.uwm.edu.zad15;

 class TestProperty {
  public static void main(String[] args) {

   Property p1 = new Property("malinowa 4",3,3.12);
   Property p2 = new Property("malinowa 4",3,3.12);
   Property p3 = new Property("malinowa 4",3,3.18);
   Property p4 = null;
   Property p5 = new Property(new String("malinowa 4"),3,3.12);

   System.out.println(p1.equals(p2));
   System.out.println(p1.equals(p3));
   System.out.println(p1.equals(p4));
   System.out.println(p1.equals(p5));

   House h1 = new House("malinowa 4",3,3.12,4);
   House h2 = new House("malinowa 4",3,3.12,3);
   House h3 = new House("malinowa 4",3,3.12,4);
   House h4 = null;

   System.out.println(h1.equals(p1));
   System.out.println(h1.equals(h2));
   System.out.println(h1.equals(h4));
   System.out.println(h1.equals(h3));

  }
}
