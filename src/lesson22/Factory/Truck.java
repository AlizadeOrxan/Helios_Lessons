package lesson22.Factory;

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Quru yolu ilə çatdırılır (Yük Maşını).");

    }
}
