import java.util.*;
public class PersonList {

    private ArrayList<Person> persons;

    public PersonList() {
        persons = new ArrayList<>();
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    // Returns true if the person was added successfully
    public void addPerson(Person person) {
        persons.add(person);
    }

    public void removePerson(Person person) {
        persons.remove(person);
    }

    public Person searchPerson(String name) {
        for (Person p : persons) {
            if (p.getFirst_name().equalsIgnoreCase(name) ||
                    p.getLast_name().equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }


}
