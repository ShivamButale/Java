
class Student {
    Student() {
        System.out.println("This is first student constructor");
    }
}

class School extends Student {
    School() {
        System.out.println("This is second student constructor");
    }
}

class studentschool extends School {
    studentschool() {
        System.out.println("This is third student constructor");
    }
}


public class ConstructorInheritance {
    public static void main(String[] args) {
        studentschool ss = new studentschool();
    }
}