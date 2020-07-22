import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        double w, h, result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width & height of traingle");
        w = sc.nextDouble();
        h = sc.nextDouble();
        result = (w*h)/2;
        System.out.println("Area of Traingle : "+ result);
    }
}