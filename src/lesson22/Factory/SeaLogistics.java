package lesson22.Factory;

public class SeaLogistics extends Logistics{

    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
