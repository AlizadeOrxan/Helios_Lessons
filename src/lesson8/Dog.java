package lesson8;

public class Dog extends Animal implements Swimable , Movable{

    String cins;

    public Dog(String ad, String cins) {
        super(ad);
        this.cins = cins;
    }

    @Override
    public void swim() {
        System.out.println("It uzur");
    }

    @Override
    public void move() {
        System.out.println(" It hereket edir");
    }

}
