class GetArmstrong extends Thread {
    public void run() {
        int add = 0, res=0, x, y;
        for(y=1; y<500; y++) {
            x = y;
            add = res = 0;
            while(x>0) {
                res = x % 10;
                add = add + (res*res*res);
                x = x/10;
            }
            if(add==y) {
                System.out.println(" "+y);
            }
        }
    }
}
public class ArmstrongMultithreading {
    public static void main(String[] args) {
        GetArmstrong ga = new GetArmstrong();
        ga.start();
    }
}