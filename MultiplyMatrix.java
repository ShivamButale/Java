import java.io.*;

class MultiplyMatrix {
    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1[][] = new int[2][2];
        int num2[][] = new int[2][2];
        int num3[][] = new int[2][2];
        int x, y, z;
        System.out.println("Please enter matrix 1 values ");
        for(x=0; x<2; x++) {
            for(y=0;y<2;y++) {
                num1[x][y] = Integer.parseInt(br.readLine());
            }
        }

        // Display Matrix 1 Values
        for(x=0; x<2; x++) {
            for(y=0;y<2;y++) {
                System.out.print(num1[x][y]+" ");
            }
            System.out.println();
        }

        System.out.println("Please enter matrix 2 values ");
        for(x=0; x<2; x++) {
            for(y=0;y<2;y++) {
                num2[x][y] = Integer.parseInt(br.readLine());
            }
        }

         // Display Matrix 2 Values
        for(x=0; x<2; x++) {
            for(y=0;y<2;y++) {
                System.out.print(" "+num2[x][y]);
            }
            System.out.println();
        }

        //Sum
        for(x=0; x<2; x++) {
            for(y=0;y<2;y++) {
                num3[x][y] = 0;
                for(z=0;z<2;z++) {
                    num3[x][y] += num1[x][z] * num2[z][y];
                }
            }
        }

        System.out.println("The Multiplication of the two matrices is : ");
        for(x=0; x<2; x++) {
            for(y=0;y<2;y++) {
                System.out.print(" "+num3[x][y]);
            }
            System.out.println();
        }
        
    } 
}