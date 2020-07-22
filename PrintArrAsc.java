import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class PrintArrAsc {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int num1=0, num2[] = new int[7], x, y;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter array elements: ");
        
        for(x=0;x<7;x++) {
            num2[x] = Integer.parseInt(br.readLine());
        }

        for(x=0;x<7;x++) {
            for(y=x+1;y<7;y++) {
                if(num2[x] > num2[y]) {
                    num1 = num2[x];
                    num2[x] = num2[y];
                    num2[y] = num1;
                }
            }
        }

        System.out.println("Array in Ascending Order : ");
        for(x=0;x<7;x++) {
            System.out.print(" "+num2[x]);
        }
    }

}