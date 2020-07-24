public class SwapNumbers {
    public static void main(String[] args) {
        int x = 200;
        int y = 500;
        System.out.println("Values before swapping : x = "+x+" y = "+y);

        swapvalues(x,y);
    }

    public static void swapvalues(int x, int y) {
        int swapv = x;
        x = y;
        y = swapv;
        System.out.println("Values after swapping : x = "+x+" y = "+y);
    }
}