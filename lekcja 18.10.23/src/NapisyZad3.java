public class NapisyZad3 {
    public static void main(String[] args) {
        String s1 = "Hello World";

        System.out.println(s1);
        System.out.println(usunSpacje(s1));
        System.out.println(s1);
    }

    public static String usunSpacje(String s) {
        return s.replace(" ","");
    }
}
