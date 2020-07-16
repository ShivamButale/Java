public class StaticVariable {
    public static void main(String args[]) {
        Employee e1 = new Employee(101, "Ram");
        e1.display();
    }
}

class Employee {
    int Reg_No;
    String Name;
    static String Company = "OKBK";
    Employee(int a, String s) {
        Reg_No = a;
        Name = s;
    }
    void display() {
        System.out.println("Your Details are  : "+Reg_No+" "+Name+" "+Company);
    }
}

