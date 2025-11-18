package lesson7;

abstract class Vehichle {

    public abstract void displayInfo();
    public abstract void calculatePrice(int a , int b);

    public void start(){
        System.out.println("Starting ");
    }

}
