package lesson8;

public class Devequshu extends Animal implements Flyable, Movable, Swimable{
        String reng ;

    public Devequshu(String ad, String reng) {
        super(ad);
        this.reng = reng;
    }

    @Override
    public void fly() {
        System.out.println("Devequshu uchur");
    }

    @Override
    public void move() {
        System.out.println("Devequshu hereket edir");
    }

    @Override
    public void swim() {
        System.out.println("Devequshu uzur");
    }
}
