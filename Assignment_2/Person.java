public class Person {
    //attributes
    private String first_name;
    private String last_name;
    private String student_number;
    private int age;


    public Person(String first_name, String last_name, String student_number, int age) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.student_number = student_number;
        this.age = age;

    }


    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public String getStudent_number() {
        return student_number;
    }
    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }


}
