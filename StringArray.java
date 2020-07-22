import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringArray {
    public static void main(String[] args) throws IOException {
        String st[] = new String[7];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter String : ");
        for(int x=0; x<7; x++) {
            st[x] = br.readLine();
        }
        System.out.println("Result of String Array : ");
        for(int x=0; x<7; x++) {
            System.out.print(" "+ st[x]);
        }
    }
}