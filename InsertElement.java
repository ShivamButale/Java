import java.util.*;

public class InsertElement {
    public static void main(String[] args) {
        int w, x, y, z;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array before insertion : ");
        x = sc.nextInt();
        
        int num1[] = new int[x+1];

        System.out.println("Please enter initial elements now : ");
        for(w=0; w<x; w++) {
            num1[w] = sc.nextInt();
        }

        System.out.println("Choose a preferred position for new element : ");
        y = sc.nextInt();

        System.out.println("Enter your new element : ");
        z = sc.nextInt();

        for(w=(x-1); w>=y-1; w--) {
            num1[w+1] = num1[w]; 
        }
        num1[y-1] = z;
        System.out.print("Result after inserting new element : ");
        
        for(w=0; w<x; w++) {
            System.out.println(num1[w]+" "); 
        }
        System.out.println(num1[x]);
        
    }
}