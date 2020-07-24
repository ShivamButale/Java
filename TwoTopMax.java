public class TwoTopMax{
    public void MaximumNums(int[] num1) {
        int max1= 0 ;
        int max2 =0 ;
        for(int x:num1) {
            if(max1 < x) {
                max2 = max1;
                max1 = x;
            }
            else if (max2 < x) {
                max2 = x;
            }
        }
        System.out.println("First Max Number : "+max1);
        System.out.println("Second Max Number : "+max2);
    }

    public static void main(String[] args) {
        int num2[] = {43,78,9,1000,5000,12,7,3,0};

        TwoTopMax t = new TwoTopMax();
        t.MaximumNums(num2);
    }
}