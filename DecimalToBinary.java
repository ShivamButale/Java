import java.util.*;
public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println("Enter a decimal number : ");
        Scanner sc = new Scanner(System.in);
        int xx = sc.nextInt();
        System.out.println("Binary Equivalent : ");
        convert(xx);
        System.out.println();
    }

    public static void convert(int num1) {
        int bin[] = new int[40];
        int ind = 0;
        while(num1>0) {
            bin[ind++] = num1%2;
            num1 = num1/2;
        }
        for(int x=ind-1; x>=0; x--) {
            System.out.print(bin[x]);
        }
    }
}