import java.util.*;
public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int x = sc.nextInt();

        int perfectsquare = (int)Math.sqrt(x);
        if (perfectsquare*perfectsquare==x) {
            System.out.println("Perfect Square");
        }
        else {
            System.out.println("Not a Perfect Square");
        }
    }
}