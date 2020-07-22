import java.util.*;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your score: ");
        int x;
        x = sc.nextInt();
        if(x>=0 && x<=40) {
            System.out.println("You failed");
        }        
        else if(x>40 && x<70) {
            System.out.println("You passed");
        }
        else if(x>=70) {
            System.out.println("Excellent");
        }
        else if(x<0) {
            System.out.println("Please input non negative number ");
        }
        else {
            System.out.println("Please input valid number ");
        }
    }
}