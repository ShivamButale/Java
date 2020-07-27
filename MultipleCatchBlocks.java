public class MultipleCatchBlocks {
    public static void main(String[] args) {
        
        try {
            int x[] = {5, 7, 3, 2, 9, 10, 0};
            float y = x[2]/2;
            
            
            // System.out.println(y);    
        } catch (ArithmeticException e) {
            System.out.println("This is an "+e);
        }
        catch(IndexOutOfBoundsException e) {
            System.out.println("This is an "+e);
        }
        catch(Exception e) {
            System.out.println("This is an "+e);
        }
        System.out.println("Out of try catch block ");
    }   
}