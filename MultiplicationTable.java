import java.util.*;
class MultiplicationTable {
    public static void main(String[] args) {
        int x, y;
        System.out.println("Enter the number for multiplication table : ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        System.out.println("Result of Multiplication Table of  "+x+" is : ");
        for(y=1;y<=10;y++) {
            System.out.println(x+"*"+y+"="+(x*y));
        }
    }
}