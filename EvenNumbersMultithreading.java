class Even extends Thread {
    public void run() {
        for(int x=1; x<=10; x++) {
            if(x%2==0) {
                System.out.println(x+" is a even number");
            }
            else {
                System.out.println(x+" is not an even number");
            }
        }
    }
}
public class EvenNumbersMultithreading{
    public static void main(String[] args) {
        Even e1 = new Even();
        e1.start();
    }
}