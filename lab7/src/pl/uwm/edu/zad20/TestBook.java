package pl.uwm.edu.zad20;

 class TestBook {
     public static void main(String[] args) {
        Book b1 = new Book("mickiewicz","dziady",2000);
        Book b2 = new Book("mickiewicz","dziady",2000);
        Book b3 = new Book("bobelm","dziady",2000);

        Ebook e1 = new Ebook("bobelm","witek",2002,4);
        Ebook e2 = new Ebook("bobelm","witek",2002,3);
        Ebook e3 = new Ebook("maciej","witek",2002,4);

        PaperBook p1= new PaperBook("bobelm","dziady",201,34);
        PaperBook p2= new PaperBook("bob","mama",201,34);
        PaperBook p3= new PaperBook("bobelm","mama",201,54);
        PaperBook p4= new PaperBook("bobelm","mama",201,34);

         System.out.println(b1.equals(b2));
         System.out.println(b1.equals(b3));
         System.out.println(p1.equals(p4));

     }
}
