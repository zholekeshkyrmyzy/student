import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class School {
    private List<Person> members;

    public School() {
        this.members = new ArrayList<>();
    }

    public void addMember(Person person) {
        if (person != null) {
            members.add(person);
        } else {
            throw new IllegalArgumentException("Person cannot be null.");
        }
    }

    @Override
    public String toString() {
        Collections.sort(members, Comparator.comparing(Person::getSurname));
        StringBuilder result = new StringBuilder();
        for (Person member : members) {
            result.append(member).append("\n");
        }
        return result.toString();
    }
}