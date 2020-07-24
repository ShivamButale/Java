import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, z=0, arms;
        System.out.println("Enter a positive number ");
        x = sc.nextInt();
        y = x;

        while(y != 0) {
            arms = y % 10;
            z = z + arms*arms*arms;
            y = y/10;
        }

        if(z==x) {
            System.out.println("This is a Armstrong Number");
        }
        else {
            System.out.println("This is not a Armstrong Number");
        }
    }
}