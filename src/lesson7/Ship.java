package lesson7;

public class Ship extends Vehichle{
    double engineSize;
    String fuelType;
    int weight;

    public Ship(double engineSize, String fuelType, int weight) {
        this.engineSize = engineSize;
        this.fuelType = fuelType;
        this.weight = weight;
    }

    @Override
    public void displayInfo() {
        System.out.println("Engine Size: " + engineSize);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Weight: " + weight);
    }

    @Override
    public void start() {
        System.out.println("Starting Ship");
    }

    @Override
    public void calculatePrice(int a, int b) {
        System.out.println("Calculating Price of Ship" + a + b );
    }
}
