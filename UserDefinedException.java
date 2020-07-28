class DefineException  extends  Exception {
    String sr1;
    DefineException(String sr2) {
        sr1 = sr2;
    } 
    public String toString() {
        return ("Our result is : "+sr1);       
    }

}
public class UserDefinedException {
    public static void main(String[] args) {
        try {
            throw new DefineException("a user defined exception");
        }
        catch(DefineException exp) {
            System.out.println("This is inside a catch block");
            System.out.println(exp);
        }
    }
}