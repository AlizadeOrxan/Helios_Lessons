package lesson17.deadlock;

public class DeadlockExample {

    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    public static void main(String[] args) {



            Thread threadA = new Thread(() -> {
                synchronized (lock1) {
                    System.out.println("Thread A: burgac əldə etdi. chekic gözləyir...");
                    try { Thread.sleep(1000); } catch (Exception ignored) {}

                    synchronized (lock2) {
                        System.out.println("Thread A: chekic əldə etdi.");
                    }
                }
            });

            Thread threadB = new Thread(() -> {
                synchronized (lock2) {
                    System.out.println("Thread B: burgac əldə etdi. chekic gözləyir...");
                    try { Thread.sleep(4000); } catch (Exception ignored) {}

                    synchronized (lock1) {
                        System.out.println("Thread B: Chekic əldə etdi.");
                    }
                }
            });

            threadA.start();
            threadB.start();
        }
    }
