package Homework5.Problem2;

public class Student extends Person{
    public static final String Freshman = "Freshman";
    public static final String Sophomore = "Sophomore";
    public static final String Junior = "Junior";
    public static final String Senior = "Senior";

    protected String status;

    public Student(String name) {
        super(name);
    }

    public Student(String name, String status) {
        super(name);
        this.status = status;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + " - Class: " + this.getClass().getName();
    }
}
