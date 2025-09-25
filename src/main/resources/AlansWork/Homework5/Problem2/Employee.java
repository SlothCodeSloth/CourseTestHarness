package Homework5.Problem2;

public class Employee extends Person {
    protected String office;
    protected double salary;
    protected int experience;

    public Employee(String name) {
        this(name, "none", 0, 0);
    }

    public Employee(String name, String office, double salary, int experience) {
        super(name);
        this.office = office;
        this.salary = salary;
        this.experience = experience;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + " - Class: " + this.getClass().getName();
    }
}
