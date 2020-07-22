import java.io.*;
public class PrintArrays_2 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int x[] = new int[7];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter array elements : ");
        for(int y=0;y<7;y++) {
            x[y] = Integer.parseInt(br.readLine());
        }
        for(int y=0;y<7;y++) {
            System.out.print(" "+x[y]);
        }
        
    }
}