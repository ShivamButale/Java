import java.util.*;
public class BinToDec {
    public static void main(String[] args) {
        int bnum, dnum=0, x=1,  num1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter binary number : ");
        bnum = sc.nextInt();

        int bnum2 = bnum;
        while(bnum!=0) {
            num1 = bnum%10;
            dnum = dnum + num1*x;
            x = x*2;
            bnum = bnum/10;
        }
        System.out.print("Decimal equivalent of "+bnum2+" is "+dnum);
        System.out.println();
    }
}