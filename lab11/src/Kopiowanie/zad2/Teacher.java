package Kopiowanie.zad2;

public class Teacher implements Cloneable{
    private String name;
    private String subject;
    private int experience;
    @Override
    public Teacher clone()throws CloneNotSupportedException {
        return (Teacher) super.clone();
    }

    public Teacher(String name, String subject, int experience) {
        this.name = name;
        this.subject = subject;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
