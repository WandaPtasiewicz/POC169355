public class polindrom {
    public static void main(String[] args) {
        String napis = "kajak";
        String napis2 = "Arek";
        polindrom(napis);
        StringBuilder arek = new StringBuilder(napis2).reverse();
        System.out.println(arek);
    }
    public static void polindrom(String napis){
        String nowyNapis="";
        for(int i =napis.length()-1;i>=0;i--){
            nowyNapis= napis.charAt(i)+ nowyNapis;
        }
        System.out.println(napis.equals(nowyNapis));
    }
}
