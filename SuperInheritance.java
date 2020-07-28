class student {
    String firstname;
    String lastname;

    student(String fname, String lname) {
        firstname = fname;
        lastname = lname;
    }
}

class school extends student {
    int grade;
    String subject;

    school(String fname, String lname, int score, String sub) {
        super(fname, lname);
        grade = score;
        subject = sub;
    }
}

public class SuperInheritance {
    public static void main(String[] args) {
        school  s1 = new school("David", "Jacob", 98, "Java");
        System.out.println("Student's firstname : "+s1.firstname);
        System.out.println("Student's lastname : "+s1.lastname);
        System.out.println("Student's grade : "+s1.grade);
        System.out.println("Student's subject : "+s1.subject);
    }
}