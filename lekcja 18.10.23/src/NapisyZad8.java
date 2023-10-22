public class NapisyZad8 {
    public static void main(String[] args) {
        String s= "motylek";
        System.out.println(czyZaczynaIKonczy(s,"mo","lek"));
    }
    public static boolean czyZaczynaIKonczy(String slowo,String poczatek,String koniec){
        if(slowo.startsWith(poczatek)==slowo.endsWith(koniec)){
            return true;
        }
        return false;
    }
}
