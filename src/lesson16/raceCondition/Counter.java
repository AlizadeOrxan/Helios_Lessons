package lesson16.raceCondition;

public class Counter {
    int count = 0;

    Object lock1 = new Object();
    public void increment() {
        synchronized (lock1) {
            count++;
        }
    }
}
