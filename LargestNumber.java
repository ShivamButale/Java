import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, z;
        System.out.println("Please enter 3 distinct integer numbers : ");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

        if(x>y && x>z) {
            System.out.println("Largest : "+x);
        }
        else if(y>x && y> z ) {
            System.out.println("Largest : "+y);
        }
        else if(z>x  && z>y ){
            System.out.println("Largest : "+z);
        }
        else {
            System.out.println("All are not distinct ");
        }
    }
}