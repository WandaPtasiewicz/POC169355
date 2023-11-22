package pl.uwm.edu.zad19;

import java.util.ArrayList;

class TestMusicAlbum {
     public static void main(String[] args) {
        MusicAlbum m1 = new MusicAlbum("Nirvana","Come as");
         ArrayList<Integer> list= new ArrayList<>();
         for(int i =0;i<10;i++){
             list.add(i);
         }
         m1.setRatings(list);
         System.out.println(m1.getRatings());
     }
}
