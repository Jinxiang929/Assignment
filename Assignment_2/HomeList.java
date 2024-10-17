import java.util.ArrayList;
import java.util.*;

public class HomeList {
    ArrayList<Home> homes;
    public HomeList() {
        homes = new ArrayList<>();
    }
    public ArrayList<Home> getHomes() {
        return homes;
    }

    public boolean addHome(Home home) {
        return homes.add(home);
    }
    public boolean removeHome(Home home) {
        return homes.remove(home);
    }

    public Home searchHome(String home) {
        for (Home h : homes) {
            if (h.getHome_addr1().equalsIgnoreCase(home) ||
                    h.getHome_addr2().equalsIgnoreCase(home)) {
                return h;
            }
        }
        return null;
    }
}
