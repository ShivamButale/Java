public class UseThis {
    int num1, num2;
    UseThis(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    void show() {
        System.out.println("Value of Num1 is : "+num1);
        System.out.println("Value of Num2 is : "+num2);
    }
    public static void main(String args[]) {
        UseThis u1 = new UseThis(100,200);
        u1.show();
    }
}