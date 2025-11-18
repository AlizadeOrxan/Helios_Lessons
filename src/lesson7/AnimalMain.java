package lesson7;

public class AnimalMain {
    public static void main(String[] args) {


        Animal animal = new Animal("alabash",true);

        Cat cat = new Cat("Mestan",true,"Qara");
        Dog dog = new Dog("Baron",true,"Boz");

        animal.makeSound();
        cat.makeSound();
        dog.makeSound();
        dog.displayInfo();




    }
}
