class GetCube extends Thread {
    public void run() {
        for(int x=1; x<=10; x++) {
            System.out.println("Square of "+x+" is : "+x*x*x);
        }
    }
}

public class CubeNumbersMultithreading {
    public static void main(String[] args) {
        GetCube gs = new GetCube();
        gs.start();
    }
}