package lesson17;

public class WareHouse {
    private int item;          // anbarda olan məhsul
    private boolean hasItem = false; // anbar doludurmu ?

    public synchronized void produce(int value) {
        while (hasItem) { // doludur mu deye baxir ilk once sherti yoxlayir
            try {
                System.out.println("Producer: anbar doludur," + Thread.currentThread().getName() + " gozleyir...");
                wait();
            } catch (InterruptedException e) {}
        }

        item = value;
        hasItem = true;
        System.out.println("Producer:" + Thread.currentThread().getName() + " mehsul istehsal etdi → " + item);
        notify(); // consumeri oyadiriq xeberdar edirik
    }

    public synchronized int consume() {
        while (!hasItem) { // dolu deyil mi deye sherti yoxlayir
            try {
                System.out.println("Consumer: anbar boshdur,"+ Thread.currentThread().getName() + " gozleyir...");
                wait();
            } catch (InterruptedException e) {}
        }

        hasItem = false;
        System.out.println("Consumer: "+ Thread.currentThread().getName() + " mehsul goturdu → " + item);
        notify(); // produceri oyadiriq xeber veririk
        return item;
    }


}
