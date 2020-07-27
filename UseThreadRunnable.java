public class UseThreadRunnable implements Runnable{
    public static void main(String[] args) {
        UseThreadRunnable runthread = new UseThreadRunnable();
        Thread th = new Thread(runthread);
        th.start();
    }

    @Override
    public void run() {
        System.out.println("This is a runnable interface...");
    }
}