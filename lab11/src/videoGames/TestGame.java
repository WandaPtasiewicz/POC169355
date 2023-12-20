package videoGames;

import java.util.ArrayList;

public class TestGame {
    public static void main(String[] args) {
        Game g1 =new Game("mario","ktos",2003,"adventure");
        Game g2 =new Game("mario","ktos",2003,"horror");
        Game g3 =new Game("mario","ktos",2003,"point and click");
        Game g4 =new Game("mario","ktos",2003,"rpg");
        Game g5 =new Game("mario","ktos",2003,"farm");
        ArrayList<Game>list=new ArrayList<>();
        list.add(g1);
        list.add(g2);
        list.add(g3);
        list.add(g4);
        list.add(g5);
        list.sort(null);
        for(var el:list){
            System.out.println(el.toString());
        }
    }
}
