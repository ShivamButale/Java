import java.util.*;
public class Prime {
    public static void main(String[] args) {
        int x = 0;
        int num1= 0;

        System.out.println("Enter a number as limit : ");

        Scanner sc =  new Scanner(System.in);
        int num2 = sc.nextInt();

        for(x=1; x<=num2; x++) {
            int primecount = 0;
            for(num1=x; num1>=1; num1--) {
                if(x%num1==0) {
                    primecount = primecount+1;
                }
            }
            if(primecount==2) {
                System.out.println("Prime number "+x);
            }
        }
    }
}