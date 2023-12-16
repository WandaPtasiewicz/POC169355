package Interfejsy.Comparable.zad21;

import java.util.ArrayList;

public class TestClient {
    public static void main(String[] args) {
        Client c1 = new Client("marek",2000);
        Client c2 = new Client("arek",2000);
        Client c3 = new Client("marek",4000);

        Company c4= new Company("piotrek",3000,5);
        Company c5= new Company("pdk",999,5);
        ArrayList<Client> list=new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        list.add(c5);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).toString());
        }
        list.sort(null);
        System.out.println("sort");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).toString());
        }

    }
}
