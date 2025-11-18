package lesson16.raceCondition;

public class RaceExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
//
//        Runnable task = () -> {
//            for (int i = 0; i < 1000; i++) {
//                counter.increment();
//            }
//        };



//        // İki thread eyni obyekti paylaşır
//        Thread t1 = new Thread(task);
//        Thread t2 = new Thread(task);


        Thread t1 = new Thread(()->{
            for (int i=0; i<1000 ; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(()->{
            for (int i=0; i<1000 ; i++) {
                counter.increment();
            }
        });


        t1.start();
        t2.start();

        // Thread-lərin bitməsini gözləyirik
        t1.join();
        t2.join();

        // Gözlənilən nəticə 2000 olmalıdır, amma az da ola bilər
        System.out.println("count = " + counter.count);
    }
}
