package lesson6;

public class Phone {

    String brand;
    String model;
    int memory;

    public Phone(String brand, String model, int memory) {
        this.brand = brand;
        this.model = model;
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", memory=" + memory +
                '}';
    }
}
