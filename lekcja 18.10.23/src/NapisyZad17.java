import java.lang.String;
import java.lang.StringBuffer;
import java.lang.Character;
public class NapisyZad17 {
    public static void main(String[] args) {
        StringBuffer napis = new StringBuffer("informatyka");
        capitalizeEverySecond(napis);
        System.out.println(napis);
    }
    public static void capitalizeEverySecond(StringBuffer a){
        for(int i=1;i<a.length();i+=2){
            char temp = Character.toUpperCase(a.charAt(i));
            a.setCharAt(i,temp);
        }
    }
}
