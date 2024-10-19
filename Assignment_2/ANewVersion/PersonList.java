package ANewVersion;

import java.util.ArrayList;


public class PersonList {
    private ArrayList<Persons> persons = new ArrayList<>();

    public int size() {
        return persons.size(); // Delegate to the internal ArrayList
    }


    public void addPerson(Persons person) {
        persons.add(person);
    }

    public void removePerson(Persons person) {
        persons.remove(person);
    }

    public String[][] toArray() {
        String[][] data = new String[persons.size()][6]; // Adjust to match the number of attributes
        for (int i = 0; i < persons.size(); i++) {
            Persons person = persons.get(i);
            data[i][0] = person.getFirst_name();
            data[i][1] = person.getLast_name();
            data[i][2] = person.getCity();
            data[i][3] = person.getZip();
            data[i][4] = person.getWork_city();
            data[i][5] = person.getWork_zip();
        }
        return data;
    }

    public String[] getColumnNames() {
        return new String[]{"First Name", "Last Name", "Home City", "Home Zip", "Work City", "Work Zip"};
    }

    public ArrayList<Persons> getAllPersons() {
        return new ArrayList<>(persons);// Returns the list of persons
     }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Persons person : persons) {
            sb.append(person.toString()).append("\n"); // Append each person's string representation
        }
        return sb.toString();
    }

    public Object get(int i) {
        return persons.get(i);
    }
}
