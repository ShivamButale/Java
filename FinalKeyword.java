public class FinalKeyword {
    public static void main(String args[]) {
        Employee e1 = new Employee(123);
        e1.display();
    }
}

class Employee {
    final int Reg_No;

    Employee(int number) {
        Reg_No = number;
    }

    void display()  {
        System.out.println("Employee Number is "+Reg_No);
    }

}

