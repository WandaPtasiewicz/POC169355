package artGallery;

import java.util.Arrays;

public class TestArtwork {
    public static void main(String[] args) {
        Artwork a1 = new Artwork(12,"monalizak","mickiewicz");
        Artwork a2 = new Artwork(2,"lecilizak","mullewicz");
        Artwork a3 = new Artwork(142,"monapupu","milrkiewicz");
        Artwork a4 = new Artwork(121,"monafiufifu","mackiewicz");
        Artwork a5 = new Artwork(16,"monsds","mickiewicz");
        Artwork[]tablica={a1,a2,a3,a4,a5};
        Arrays.sort(tablica);
      for(int i =0;i< tablica.length;i++){
          System.out.println(tablica[i].toString());
      }
    }
}
