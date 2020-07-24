import java.util.*;

public class RandomNumber {
    public static void main(String[] args) {
        int rand;
        Random randnum = new Random();
        System.out.println("Result : ");
        for(rand=1;rand<=7;rand++) {
            System.out.println(randnum.nextInt(2000));
        }
    }
}