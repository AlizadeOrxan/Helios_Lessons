package lesson17;

public class WareHouseDemo {
    public static void main(String[] args) {

        WareHouse warehouse = new WareHouse();

        // Producerin Threadi
        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                warehouse.produce(i);
                try { Thread.sleep(1000); } catch (InterruptedException e) {}
            }
        });

        // Consumerin Threadi
        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                warehouse.consume();
                try { Thread.sleep(1500); } catch (InterruptedException e) {}
            }
        });

        producer.start();
        consumer.start();

    }
}
