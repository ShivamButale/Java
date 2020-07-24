import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        int add=0;
        int addall = num1;
        int sum = 0;
        while(addall !=0 ) {
            add = addall % 10;
            sum += add;
            addall /= 10; 
        }
        System.out.println("Sum : "+sum);

    }
}