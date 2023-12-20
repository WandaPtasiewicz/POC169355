package Kopiowanie.zad17;

public class SeniorDevelover extends Developer{
    private double bonus;

    public SeniorDevelover(String name, int age, double salary, double bonus) {
        super(name, age, salary);
        this.bonus = bonus;
    }

    @Override
    protected SeniorDevelover clone() throws CloneNotSupportedException {
        return (SeniorDevelover)super.clone();
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
