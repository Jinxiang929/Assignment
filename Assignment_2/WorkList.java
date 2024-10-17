import java.util.ArrayList;

public class WorkList {
    ArrayList<Work> workList;
    public WorkList() {
        workList = new ArrayList<>();
    }
    public ArrayList<Work> getWorkList() {
        return workList;
    }
    public boolean addWork(Work work) {
        return workList.add(work);
    }
    public boolean removeWork(Work work) {
        return workList.remove(work);
    }
    public Work searchWork(String work) {
        for (Work w : workList) {
            if (w.getWork_addr1().equalsIgnoreCase(work) ||
                    w.getWork_addr2().equalsIgnoreCase(work)) {
                return w;
            }
        }
        return null;
    }
}
