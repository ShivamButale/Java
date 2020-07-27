class UseThread  extends Thread{

    public void run() {
        System.out.println("This is a runnable thread...");
    }

    public static void main(String[] args) {
        UseThread ust = new UseThread();
        ust.start();
    }
}