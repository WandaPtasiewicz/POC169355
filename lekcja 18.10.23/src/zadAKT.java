public class zadAKT {
    public static void main(String[] args) {
        double b= 56.5;
        System.out.println(b);
        System.out.println(stopnieNaRadioany(b));
        System.out.println(stopnieNaRadioany(23.3));
    }
    public static double stopnieNaRadioany(double a){
        a=a*3.14 /180;
        return a;
    }
}
