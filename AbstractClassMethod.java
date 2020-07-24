abstract class calculate {
    double base, height;
    calculate(double x, double y) {
        base = x;
        height = y;
    }
    abstract double area();
} 

class Rectangle extends calculate {
    Rectangle(double x, double y) {
        super(x, y);
    }
    double area() {
        return base*height;
    }
}

class Triangle extends calculate {
    Triangle(double x, double y) {
        super(x, y);
    }
    double area() {
        return base*height/2;
    }
}

public class AbstractClassMethod {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(10, 45);
        Rectangle r1 = new Rectangle(15, 25);

        calculate cal1;
        
        cal1 = t1;
        System.out.println("Area of triangle is "+cal1.area());

        cal1 = r1;
        System.out.println("Area of rectangle is "+cal1.area());
    }
}