import java.util.*;

public class Factorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3=1;
        System.out.println("Please insert a number : ");
        num1 = sc.nextInt();
        if (num1<0) {
            System.out.println("Please  enter only non negative numbers !");
        }   
        else if(num1==0) {
            num3 = 0;
            System.out.println("Factorial Answer of "+num1+" : "+ num3);
        }
        else {
            for(num2=1;num2<=num1;num2++) {
                num3 = num3 *  num2;
            }
            System.out.println("Factorial Answer of "+num1+" : "+ num3);
        }
        
    }
}