class ExceptionHandling {
    public static void main(String[] args) {
       int a=30;
       float b=0;

       try {
           float c = a/b;
           System.out.println("Result : "+c);
       } catch (ArithmeticException exception) {
           System.out.println("Please dont use zero as divisor");
       }
    }
}