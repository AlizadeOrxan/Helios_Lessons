package lesson22.Factory;

public class Ship implements Transport {

    @Override
    public void deliver() {
        System.out.println("Dəniz yolu ilə çatdırılır (Gəmi).");
    }
}
