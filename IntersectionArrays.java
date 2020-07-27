import java.util.*;
public class IntersectionArrays {
    public static int[] sumElement(int[] x, int intersect) {
        int[] output = Arrays.copyOf(x, x.length + 1);
        output[x.length] = intersect;
        return output;
    }

    public static int[] IntersectElement(int[] y, int[] z) {
        int[] inter = {};
        int i = 0, j = 0;
        while (i < y.length && j < z.length) {
            if (y[i] < z[j]) {
                i++;
            } else if (y[i] == z[j]) {
                inter = sumElement(inter, y[i]);
                i++;
                j++;
            } else {
                j++;
            }
        }
        return inter;
    }

    public static void main(String[] args) {
        int[] y = { 56, 17, 8, 3, 2, 10, 700, 1000, 33, 18 };
        int[] z = { 2, 500, 17, 24, 13, 8, 18, 1 };

        IntersectionArrays ar = new IntersectionArrays();

        Arrays.sort(y);
        Arrays.sort(z);

        int[] output = IntersectionArrays.IntersectElement(y, z);
        System.out.println("Result of intersection is : "+Arrays.toString(output));
    }
}