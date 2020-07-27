public class ThrowExample {
    public static void Checkdivby4 (int num) {
        if(num%4 !=0) {
            throw new ArithmeticException("Not divisible by 4");
        }
        else {
            System.out.println("Divisible by 4");
        }
    }
    public static void main(String[] args) {
        System.out.println("Checking divisibility by 4 ...");
        Checkdivby4(2013);
    }
}