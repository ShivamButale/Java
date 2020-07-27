import java.util.*;

class sortObjects implements Comparator<SortUsingComparatorInterface> {
    public int compare(SortUsingComparatorInterface e1, SortUsingComparatorInterface e2) {
        return (e1.getSalary() - e2.getSalary());
    }
}
public class SortUsingComparatorInterface {
    private String name;
    private String occupation;
    private int salary;

    public SortUsingComparatorInterface(String firstname, String job, int value) {
        super();
        this.name = firstname;
        this.occupation = job;
        this.salary = value;
    }

    public String getName() {
        return name;
    }

    public void setname(String name) {
        this.name= name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Name of employee is : "+name+" Occuaption is : "+occupation+" Salary is : "+salary;
    }

    public static void main(String[] args) {
        SortUsingComparatorInterface e1 = new SortUsingComparatorInterface("Hello1", "Programmer1", 1000);
        SortUsingComparatorInterface e2 = new SortUsingComparatorInterface("Hello2", "Programmer2", 200);
        SortUsingComparatorInterface e3 = new SortUsingComparatorInterface("Hello3", "Programmer3", 11000);
        SortUsingComparatorInterface e4 = new SortUsingComparatorInterface("Hello4", "Programmer4", 500);
    
        List<SortUsingComparatorInterface> employeelist = new ArrayList<SortUsingComparatorInterface>();
        employeelist.add(e1);
        employeelist.add(e2);
        employeelist.add(e3);
        employeelist.add(e4);


        System.out.println("Objects before sorting : ");
        for(SortUsingComparatorInterface employee:employeelist) {
            System.out.println(employee);
        }

        System.out.println();
        
        Collections.sort(employeelist, new sortObjects());
        System.out.println("Objects after sorting : ");
        for(SortUsingComparatorInterface employee:employeelist) {
            System.out.println(employee);
        }

    }
}