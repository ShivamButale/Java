import java.util.*;

public class ReverseNumberUsingFor {
    public static void main(String[] args) {
        int num1=0;
        int num2;
        int reversenum1 = 0;

        System.out.println("Enter number : ");
        Scanner sc = new Scanner(System.in);
        num2 = num1 = sc.nextInt();

        for(;num1!=0;) {
            reversenum1 = reversenum1 * 10;
            reversenum1 = reversenum1 + num1%10;
            num1 = num1 / 10;
        }

        System.out.println("Reverse : "+ reversenum1);
    }
}