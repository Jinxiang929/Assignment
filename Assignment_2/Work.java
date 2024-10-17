public class Work {
    private String work_addr1;
    private String work_addr2;
    private String wcity;
    private String wstate;
    private String wzip;
    private long fax;

    public Work(String work_addr1, String work_addr2, String wcity, String wstate, String wzip, long fax) {
        this.work_addr1 = work_addr1;
        this.work_addr2 = work_addr2;
        this.wcity = wcity;
        this.wstate = wstate;
        this.wzip = wzip;
        this.fax = fax;
    }
    public String getWork_addr1() {
        return work_addr1;
    }
    public void setWork_addr1(String work_addr1) {
        this.work_addr1 = work_addr1;
    }
    public String getWork_addr2() {
        return work_addr2;
    }
    public void setWork_addr2(String work_addr2) {
        this.work_addr2 = work_addr2;
    }
    public String getWcity() {
        return wcity;
    }
    public void setWcity(String wcity) {
        this.wcity = wcity;
    }
    public String getWstate() {
        return wstate;
    }
    public void setWstate(String wstate) {
        this.wstate = wstate;
    }
    public String getWzip() {
        return wzip;
    }
    public void setWzip(String wzip) {
        this.wzip = wzip;
    }
    public long getFax() {
        return fax;
    }
    public void setFax(long fax) {
        this.fax = fax;
    }
}
