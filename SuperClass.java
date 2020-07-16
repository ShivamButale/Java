class SuperClass {
    public static void main (String args[]) {
        FirstSuper f1 = new FirstSuper(100, 200);
        f1.show();
        SecondSuper s1 = new SecondSuper(400,500,600);
        s1.show();
    }
}

class FirstSuper {
    int x, y;
    FirstSuper(int a, int b) {
        x = a;
        y = b;
    }
    void show() {
        System.out.println("Value of X is : "+x);
        System.out.println("Value of Y is : "+y);
    }
}

class SecondSuper extends FirstSuper {
    int z;
    SecondSuper(int a, int b, int c) {
        super(a, b);
        z = c; 
    }
    void show() {
        super.show();
        System.out.println("Value of Z is : "+z);
    }
}