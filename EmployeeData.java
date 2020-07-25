import java.util.*;
public class EmployeeData {
    
    private String name;
    private String occupation;
    private int salary;

    public EmployeeData(String firstname, String job, int value) {
        super();
        this.name = firstname;
        this.occupation = job;
        this.salary = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }
    
    public void setOccupation(String occupation) {
        this.occupation  = occupation;
    }

    public  int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Name is : "+name+ " Occupation is : "+occupation+ " Salary is : "+salary;
    }

    public static void main(String[] args) {
        EmployeeData e1 = new EmployeeData("Hello", "Programmer", 1000);
        EmployeeData e2 = new EmployeeData("World", "Analyst", 1200);
        EmployeeData e3 = new EmployeeData("Window", "Chef", 1500);
        EmployeeData e4 = new EmployeeData("Max", "Lawyer", 2000);

        List<EmployeeData> employeelist = new ArrayList<EmployeeData>();
        employeelist.add(e1);
        employeelist.add(e2);
        employeelist.add(e3);
        employeelist.add(e4);

        System.out.println("Employee data : ");
        for(EmployeeData employee:employeelist) {
            System.out.println(employee);
        }
    }
}