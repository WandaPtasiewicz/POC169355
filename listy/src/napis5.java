import java.util.Scanner;
import java.lang.Character;
public class napis5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a;
        String alfabet="abcdefghijklmnoprstuwyz";
        int ilosc=0;
        Character znak;
        System.out.println("Podaj słowo");
        a = scanner.nextLine();
        for(int i=0;i<alfabet.length()-1;i++){
            for(int j=0;j<a.length();j++){
                if(a.charAt(j)==alfabet.charAt(i)){
                    ilosc++;
                }
            }
            System.out.println(alfabet.charAt(i)+": "+ilosc);
            ilosc =0;
        }
    }
}
