import java.util.*;

public class CenToFah {
    public static void main(String[] args) {
        double degreeF;
        double degreeC;

        System.out.println("Enter values in Centigrade : ");
        Scanner sc = new Scanner(System.in);
        degreeC = sc.nextFloat();
        degreeF = (1.8 * degreeC) + 32;
        System.out.println("Temp in Fahrenheit : "+degreeF);
    }
}