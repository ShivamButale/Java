import java.util.Scanner;
public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, z;
        int num1=1;

        System.out.println("Enter no of rows : ");
        x = sc.nextInt();

        System.out.println("Result of Floyd Trianlge is : ");
        for(y=1;y<=x;y++) {
            for(z=1;z<=y;z++) {
                System.out.print(num1 + " ");
                num1++;
            }
            System.out.println();
        }
    }

}