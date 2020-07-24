import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int num1 = 0, num2, reversenum1=0;
        System.out.println("Enter number : ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        while(num1 !=0) {
            reversenum1 = reversenum1 *10;
            reversenum1 = reversenum1+ num1%10;
            num1 = num1/10;
        }
        System.out.println("Reversed Number : "+reversenum1);
    }
}