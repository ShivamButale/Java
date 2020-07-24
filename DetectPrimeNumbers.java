import java.util.*;

public class DetectPrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        int num1, x, count=0;
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        
        for(x=2; x<num1; x++) {
            if(num1%x==0) {
                count++;
                break;
            }
        }
        if(count==0) {
            System.out.println("Prime");
        }
        else {
            System.out.println("Not Prime");
        }
    }
}