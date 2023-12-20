package Interfejsy.Comparable.zad21;

public class Company extends Client implements Comparable<Client>{
    private int numberOfEmployees;

    public Company(String lastName, double balance, int numberOfEmployees) {
        super(lastName, balance);
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public String toString() {
        return super.toString() +
                "numberOfEmployees=" + numberOfEmployees +
                '}';
    }

    @Override
    public int compareTo(Client o) {
        if(o instanceof Company){
            Company temp= (Company) o;
            int result = super.compareTo(temp);
            if(result !=0){
                return result;
            }
            return Integer.compare(this.numberOfEmployees,((Company) o).numberOfEmployees);
        }
        return super.compareTo(o);
}

}
