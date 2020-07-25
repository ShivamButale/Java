import java.util.*;
class DecToHex {
    public static void main(String[] args) {
        int dnum, num1;
        String Hnum = " ";
        char Hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter decimal number : ");
        dnum = sc.nextInt();
        int dnum1 = dnum;

        while(dnum>0) {
            num1 =  dnum % 16;
            Hnum = Hex[num1] + Hnum;
            dnum = dnum / 16;
        }

        System.out.println("Decimal equivalent of "+dnum1+ " is "+Hnum);
    }
}