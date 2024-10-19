package ANewVersion;

public class Persons {
    private String firstName;
    private String lastName;
    private String studentNumber;
    private String age;
    private String homeAddress1;
    private String homeAddress2;
    private String city;
    private String state;
    private String zip;
    private String phone;
    private String workAddress1;
    private String workAddress2;
    private String workCity;
    private String workState;
    private String workZip;
    private String fax;

    // Constructor
    public Persons(String firstName, String lastName, String studentNumber, String age,
                  String homeAddress1, String homeAddress2, String city, String state,
                  String zip, String phone, String workAddress1, String workAddress2,
                  String workCity, String workState, String workZip, String fax) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.studentNumber = studentNumber;
        this.age = age;
        this.homeAddress1 = homeAddress1;
        this.homeAddress2 = homeAddress2;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.workAddress1 = workAddress1;
        this.workAddress2 = workAddress2;
        this.workCity = workCity;
        this.workState = workState;
        this.workZip = workZip;
        this.fax = fax;
    }

    // Method to convert person details to a string array
    public String[] toStringArray() {
        return new String[]{
                firstName,
                lastName,
                studentNumber,
                age,
                homeAddress1,
                homeAddress2,
                city,
                state,
                zip,
                phone,
                workAddress1,
                workAddress2,
                workCity,
                workState,
                workZip,
                fax
        };
    }


public void setFirst_name(String first_name) {
        this.firstName = first_name;
    }
    public String getFirst_name() {
        return firstName;
    }
    public void setLast_name(String last_name) {
        this.lastName = last_name;
    }
    public String getLast_name() {
        return lastName;
    }
    public void setStudent_number(String student_number) {
        this.studentNumber = student_number;
    }
    public String getStudent_number() {
        return studentNumber;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getAge() {
        return age;
    }
    public void setHome_addr1(String home_addr1) {
        this.homeAddress1 = home_addr1;
    }
    public String getHome_addr1() {
        return homeAddress1;
    }
    public void setHome_addr2(String home_addr2) {
        this.homeAddress2 = home_addr2;
    }
    public String getHome_addr2() {
        return homeAddress2;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getCity() {
        return city;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getState() {
        return state;
    }
    public void setZip(String zip) {
        this.zip = zip;
    }
    public String getZip() {
        return zip;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPhone() {
        return phone;
    }
    public void setWork_addr1(String work_addr1) {
        this.workAddress1 = work_addr1;
    }
    public String getWork_addr1() {
        return workAddress1;
    }
    public void setWork_addr2(String work_addr2) {
        this.workAddress2 = work_addr2;
    }
    public String getWork_addr2() {
        return workAddress2;
    }
    public void setWork_city(String work_city) {
        this.workCity = work_city;
    }
    public String getWork_city() {
        return workCity;
    }
    public void setWork_state(String work_state) {
        this.workState = work_state;
    }
    public String getWork_state() {
        return workState;
    }
    public void setWork_zip(String work_zip) {
        this.workZip = work_zip;
    }
    public String getWork_zip() {
        return workZip;
    }
    public void setFax(String fax) {
        this.fax = fax;
    }
    public String getFax() {
        return fax;
    }

}
