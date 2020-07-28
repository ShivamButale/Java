class GetSquare extends Thread {
    public void run() {
        for(int x=1; x<=10; x++) {
            System.out.println("Square of "+x+" is : "+x*x);
        }
    }
}

public class SquareMultithreading {
    public static void main(String[] args) {
        GetSquare gs = new GetSquare();
        gs.start();
    }
}