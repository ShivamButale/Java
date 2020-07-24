import java.util.Scanner;

public class FahToCen {
    public static void main(String[] args) {
        float radian;
        double degree;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter value in Fahrenheit : ");
        radian = sc.nextFloat();

        degree = (radian-32)/1.8;

        System.out.println("Temperature in Celsius : "+ degree);
    }
}