package lesson16;

public class TeaMaker implements Runnable {
    /**
     * When an object implementing interface {@code Runnable} is used
     * to create a thread, starting the thread causes the object's
     * {@code run} method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method {@code run} is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Chay demlenir");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
        System.out.println("Cah chay suzmek uchun hazirlandi");
    }
}
