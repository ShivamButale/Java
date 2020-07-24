public class ArrayAverage {
    public static void main(String[] args) {
        int[] num1 = new int[] {66,4,89,7,23,12,54};
        int sum = 0;
        for(int y=0; y<num1.length; y++) {
            sum+= num1[y];
        }
        float avg = sum / num1.length;
        System.out.println("Average = "+ avg);
    }
}