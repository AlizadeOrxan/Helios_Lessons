package lesson7;

public class Cat extends Animal{
    String color;

    public Cat(String name, boolean swim, String color) {
        super(name, swim);
        this.color = color;
    }

    @Override
    void makeSound() {
        System.out.println("Miyav");
    }
}
