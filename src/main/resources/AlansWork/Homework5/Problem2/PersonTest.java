package Homework5.Problem2;

public class PersonTest {
    public static void main(String[] args) {
        Person hello = new Person("Hello");
        Student world = new Student("World");
        Employee professor = new Employee("Professor");
        Faculty praveen = new Faculty("Praveen");
        Staff tripathi = new Staff("Tripathi");

        System.out.println(hello.toString());
        System.out.println(world.toString());
        System.out.println(professor.toString());
        System.out.println(praveen.toString());
        System.out.println(tripathi.toString());
    }
}

