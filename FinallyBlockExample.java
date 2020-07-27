public class FinallyBlockExample {
    public String FinallyBlock()  {
        try{
            return "Return from try block";
        }
        finally {
            System.out.println("Return from finally block after return statement ");
        }
    }
    public static void main(String[] args) {
        System.out.println(new FinallyBlockExample().FinallyBlock());
    }
}