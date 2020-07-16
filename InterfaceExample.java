import java.io.*;

class InterfaceExample {
    public static void main(String args[]) throws Exception {
        Output ot = new Output();
        ot.evaluate();
        ot.screenshow();
    }
}

class Output extends Employee {
    int total;
    float average;
    void evaluate() throws Exception {
        GetInput();
        total = Rt1+Rt2+Rt3;
        average = (float)total/3; 
    }
    void screenshow() {
        System.out.println("Overall Rating is : "+total);
        System.out.println("Average is : "+average);
    }
}

class Employee {
    int Reg_No, Rt1, Rt2, Rt3;
    String Name;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    void GetInput() throws Exception {
        System.out.println("Please enter employee details: Reg_No, Name, Skill Levels of Java, Python and PHP");
        Reg_No = Integer.parseInt(br.readLine());
        Name = br.readLine();
        Rt1 = Integer.parseInt(br.readLine());
        Rt2 = Integer.parseInt(br.readLine());
        Rt3 = Integer.parseInt(br.readLine());
    }


    void display() {
        System.out.println("Your Reg_No is : "+Reg_No);
        System.out.println("Your Name is : "+Name);
        System.out.println("Your Java Rating is : "+Rt1);
        System.out.println("Your Python Rating is : "+Rt2);
        System.out.println("Your PHP Rating is : "+Rt3);
    }
}

