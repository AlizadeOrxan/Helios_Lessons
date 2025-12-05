package lesson22.Factory;

public class RoadLogistics extends Logistics{

    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
