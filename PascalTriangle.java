import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, z;
        
        System.out.println("Enter no of rows : ");
        x = sc.nextInt();

        System.out.println("Result of pascal triangle is  : ");
        for(y=0; y<x; y++) {
            int num1 = 1;
            System.out.format("%" + (x-y)*2 + "s", "");
            for(z=0;z<=y;z++) {
                System.out.format("%4d", num1);
                num1 = num1 * (y-z)/(z+1);
            }
            System.out.println();
        }

    }
}