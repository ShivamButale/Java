import java.util.*;

class NegativePositive {
    public static void main(String[] args) {
        int x;
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        if(x==0) {
            System.out.println("Zero entered");
        }
        else if(x<0) {
            System.out.println("This is a negative number");
        }        
        else {
            System.out.println("This is a positive number");
        }
    }
}