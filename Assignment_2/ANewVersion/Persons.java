package ANewVersion;

import java.util.ArrayList;

public class Persons {
    ArrayList<String> personlist;

    private String first_name;
    private String last_name;
    private String student_number;
    private String age;
    private String home_addr1;
    private String home_addr2;
    private String city;
    private String state;
    private String zip;
    private String phone;
    private String work_addr1;
    private String work_addr2;
    private String work_city;
    private String work_state;
    private String work_zip;
    private String fax;


    public Persons(String firstName, String lastName, String studentNumber, String age, String homeAddr1, String homeAddr2, String city, String state, String zip, String phone, String workAddr1, String workAddr2, String workCity, String workState, String workZip, String fax) {
        this.first_name = firstName;
        this.last_name = lastName;
        this.student_number = studentNumber;
        this.age = age;
        this.home_addr1 = homeAddr1;
        this.home_addr2 = homeAddr2;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.work_addr1 = workAddr1;
        this.work_addr2 = workAddr2;
        this.work_city = workCity;
        this.work_state = workState;
        this.work_zip = workZip;
        this.fax = fax;
    }
    public void addperson(Persons person){
        personlist.add(person.first_name);
        personlist.add(person.last_name);
        personlist.add(person.student_number);
        personlist.add(person.age);
        personlist.add(person.home_addr1);
        personlist.add(person.home_addr2);
        personlist.add(person.city);
        personlist.add(person.state);
        personlist.add(person.zip);
        personlist.add(person.phone);
        personlist.add(person.work_addr1);
        personlist.add(person.work_addr2);
        personlist.add(person.work_city);
        personlist.add(person.work_state);
        personlist.add(person.work_zip);
        personlist.add(person.fax);
    }
}
