import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person implements Payable, Comparable<Person> {
    private static int idCounter = 0;
    private final int id;
    private String name;
    private String surname;

    public Person() {
        this.id = ++idCounter;
        this.name = "Unknown";
        this.surname = "Unknown";
    }

    public Person(String name, String surname) {
        this.id = ++idCounter;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    @Override
    public String toString() {
        return id + ". " + name + " " + surname;
    }

    public String getPosition() {
        return "Student";
    }

    @Override
    public double getPaymentAmount() {
        return 0.0;
    }

    @Override
    public int compareTo(Person other) {
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
    }

    public static void main(String[] args) {

        Employee employee1 = new Employee("John", "Lennon", "Manager", 27045.78);
        Employee employee2 = new Employee("George", "Harrison", "Developer", 50000.00);
        Student student1 = new Student("Ringo", "Starr", 2.5);
        Student student2 = new Student("Paul", "McCartney", 3.5);

        List<Person> people = new ArrayList<>();
        people.add(employee1);
        people.add(employee2);
        people.add(student1);
        people.add(student2);

        Collections.sort(people);

        MyApplication.printData(people);
    }

}
