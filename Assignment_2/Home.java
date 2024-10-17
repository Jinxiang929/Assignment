public class Home {
    private String home_addr1;
    private String home_addr2;
    private String city;
    private String state;
    private String zip;
    private long phone;

    public Home(String home_addr1, String home_addr2, String city, String state, String zip, long phone) {
        this.home_addr1 = home_addr1;
        this.home_addr2 = home_addr2;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
    }

    public String getHome_addr1() {
        return home_addr1;
    }
    public void setHome_addr1(String home_addr1) {
        this.home_addr1 = home_addr1;
    }
    public String getHome_addr2() {
        return home_addr2;
    }
    public void setHome_addr2(String home_addr2) {
        this.home_addr2 = home_addr2;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getZip() {
        return zip;
    }
    public void setZip(String zip) {
        this.zip = zip;
    }
    public long getPhone() {
        return phone;
    }
    public void setPhone(long phone) {
        this.phone = phone;
    }
}
