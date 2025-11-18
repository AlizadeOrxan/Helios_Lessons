package lesson7;

public class Dog extends Animal{
    String foodName;

    public Dog(String name, boolean swim, String foodName) {
        super(name, swim);
        this.foodName = foodName;
    }

    @Override
    void makeSound() {
        System.out.println("Hav hav");
    }


    public void displayInfo(){
        System.out.println("Name: "+ name);
        System.out.println("Swim: "+ swim);
    }

}
