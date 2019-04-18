import java.util.List;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
        Employee orig = new Employee();
        orig.loadData();

        Employee v1 = (Employee) orig.clone();
        Employee v2 = (Employee) orig.clone();

        List<String> list1 = v1.getStaffList();
        list1.add("John");
        List<String> list2 = v2.getStaffList();
        list2.remove("David");

        System.out.println("Original Employee List: " + orig.getStaffList());
        System.out.println("Employee V1 List: " + list1);
        System.out.println("Employee V2 List: " + list2);
    }
}
