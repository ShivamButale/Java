import java.util.*;
public class ArithmeticMean {
    public static void main(String[] args) {
        int x, y, add=0, meannum;
        int num1[] = new int[50];
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter length of array : ");
        x=sc.nextInt();

        System.out.println("Enter "+x+" numbers of array ");
        for(y=0;y<x;y++) {
            num1[y] = sc.nextInt();
            add += num1[y];
        }
        meannum = add/x;
        System.out.println("Arithmetic Mean : "+meannum);
    }
}