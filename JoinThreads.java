public class JoinThreads {
    public static void main(String[] args) throws InterruptedException{
        Thread FirstThread = new Thread() {
            public void run() {
                try {
                    System.out.println(Thread.currentThread().getName()+" just started");
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName()+" just completed");
                } catch (InterruptedException ex) {
                    //TODO: handle exception
                }
            }
        };

        Thread SecondThread = new Thread() {
            public void run() {
                try {
                    System.out.println(Thread.currentThread().getName()+" just started");
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName()+" just completed");
                } catch (InterruptedException ex) {
                    //TODO: handle exception
                }
            }
        };
        FirstThread.start();
        FirstThread.join();
        SecondThread.start();
        SecondThread.join();

        System.out.println(Thread.currentThread().getName()+ " just completed");
    }
}