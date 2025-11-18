package lesson16.synchron;

import java.util.concurrent.atomic.AtomicInteger;

public class SafeCounter {
   int count = 0;

    public synchronized void increment() {
        count++;
    }

}
