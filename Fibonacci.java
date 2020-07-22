import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number : ");
        x = sc.nextInt();

        int ans = 0;

        int prev1=1;
        int prev2=0;
        int curr = 0;
        int i =0;
        for(i=2;i<x;i++) {
            curr=prev1+prev2;
            prev2=prev1;
            prev1=curr;
        }
        ans = curr;
        System.out.println("Result : "+ans);
    }
}