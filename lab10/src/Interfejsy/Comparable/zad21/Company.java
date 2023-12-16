package Interfejsy.Comparable.zad21;

public class Company extends Client {
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
        return super.compareTo(o);
    }
}
