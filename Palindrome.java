import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w, x, y=0, z=0;
        System.out.println("Please insert numbers to check Palindrome : ");
        z = sc.nextInt();
        w=z;
        while(z>0) {
            x = z % 10;
            y = (y*10) + x;
            z = z / 10;
        }
        if(w==y) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}