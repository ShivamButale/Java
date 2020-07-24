abstract class A{
    abstract void Method1();
    void Method2() {
        System.out.println("We have a concrete method here");
    }
}

class B extends  A {
    void Method1() {
        System.out.println("This is a method of class A");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        B b = new B();
        b.Method1();
        b.Method2();
    }
}