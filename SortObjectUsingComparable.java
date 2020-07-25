import java.util.ArrayList;
import java.util.Collections;

public class SortObjectUsingComparable implements Comparable<SortObjectUsingComparable>{
    private String name;
    private String occupation;
    private int salary;

    public SortObjectUsingComparable(String firstname, String job, int value) {
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
        return "Name of employee : "+name+" Occupation : "+occupation+" Salary : "+salary;
    }
 
    public int compareTo(SortObjectUsingComparable comparemydata) {
        
        int compareValue = ((SortObjectUsingComparable)comparemydata).getSalary();
        return this.salary - compareValue;
    }

    public static void main(String[] args) {
        SortObjectUsingComparable e1 = new SortObjectUsingComparable("Hello", "Programmer", 1000);
        SortObjectUsingComparable e2 = new SortObjectUsingComparable("Hello1", "Programmer1", 5000);
        SortObjectUsingComparable e3 = new SortObjectUsingComparable("Hello2", "Programmer2", 6000);
        SortObjectUsingComparable e4 = new SortObjectUsingComparable("Hello3", "Programmer3", 4000);

        ArrayList<SortObjectUsingComparable> employee = new ArrayList<SortObjectUsingComparable>();

        employee.add(e1);
        employee.add(e2);
        employee.add(e3);
        employee.add(e4);

        System.out.println("Objects before sorting : ");
        for(SortObjectUsingComparable empl:employee) {
            System.out.println(empl);
        }

        System.out.println();

        Collections.sort(employee);

        System.out.println("Objects after sorting : ");
        for(SortObjectUsingComparable empl:employee) {
            System.out.println(empl);
        }
        
    }
}