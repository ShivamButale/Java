public class SwapNumbers2 {
    public static void main(String[] args) {
        int x=200;
        int y=500;
        System.out.println("Values before swapping : x = "+x+" y = "+y);

        x = x+y;
        y = x-y;
        x = x-y;

        System.out.println("Values after swapping : x = "+x+" y = "+y);
    }
}