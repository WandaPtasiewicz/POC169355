package Interfejsy.Comparable.zad21;

public class Client implements Comparable<Client>{

    private String lastName;
    private  double balance;

    @Override
    public int compareTo(Client o) {
        int result = Double.compare(o.balance,this.balance);
        if (result != 0) {
            return result;
        }
        return this.lastName.compareTo((o.lastName));
    }

    public Client(String lastName, double balance) {
        this.lastName = lastName;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Client{" +
                "lastName='" + lastName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
