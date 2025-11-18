package lesson8;

public class Dron implements Flyable{
    String name ;
    String model ;

    public Dron(String name, String model) {
        this.name = name;
        this.model = model;
    }

    @Override
    public void fly() {
        System.out.println("Dron uchur");
    }
}
