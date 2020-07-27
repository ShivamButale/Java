import java.util.*;
class Powerof2 {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        if((num1 & num1-1) == 0) {
            System.out.println("Power of 2");
        }
        else {
            System.out.println("Not Power of 2");
        }
    }
}