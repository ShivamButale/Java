import java.util.*;

public class Minmax {
    public static void main(String[] args) {
        Integer[] num1 = {7,3,5,0,2,8,9};
        int min = (int)Collections.min(Arrays.asList(num1));
        int max = (int)Collections.max(Arrays.asList(num1));

        System.out.println("MIN : "+ min);
        System.out.println("MAX : "+ max);

    }
}