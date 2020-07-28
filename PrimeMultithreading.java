class GetPrime extends Thread {
    public void run() {
        int num1, num2 = 2;
        boolean res;
        for(num2=2; num2<=20; num2++) {
            res = false;
            for(num1=2; num1< num2; num1++) {
                if(num2%num1 == 0) {
                    res = true;
                    break;
                }
            }
            if(res == false) {
                System.out.println(num2 + " is  a prime");
            }
        }
    }
}

public class PrimeMultithreading {
    public static void main(String[] args) {
        GetPrime gp = new GetPrime();
        gp.start();       
    }
}