import java.util.Scanner;

public class DecToOct {
    public static void main(String[] args) {
        int dnum, x=1, y, num1;
        int onum[] = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number : ");
        dnum = sc.nextInt();
        num1 = dnum;
        while(num1!=0) {
            onum[x++] = num1%8;
            num1=num1/8; 
        }
        System.out.print("Octal equivalent of "+dnum+" is : ");
        for(y=x-1; y>0; y--) {
            System.out.print(onum[y]);
        }
        System.out.println();
    }

}