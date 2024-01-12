package Kol1.zad3;

public class Student implements Comparable<Student> {
    private String name;
    private float grade;

    @Override
    public int compareTo(Student o) {
        return Double.compare(grade,o.grade);
    }

    public Student(String name, float grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
