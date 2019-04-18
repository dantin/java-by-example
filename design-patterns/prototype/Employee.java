import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable {

    private List<String> staffList;

    public Employee() {
        this.staffList = new ArrayList<>();
    }

    public Employee(List<String> list) {
        this.staffList = list;
    }

    public void loadData() throws InterruptedException {
        // time-costing task.
        TimeUnit.SECONDS.sleep(1);
        for (String name : new String[]{"Alice", "Bob", "Cindy", "David"}) {
            this.staffList.add(name);
        }
    }

    public List<String> getStaffList() {
        return this.staffList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        // deep-copy.
        List<String> data = new ArrayList<>();
        for (String s : this.getStaffList()) {
            data.add(s);
        }
        return new Employee(data);
    }
}
