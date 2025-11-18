package lesson8;

public class Qarangush extends Animal implements Flyable , Movable{
    String ayagUzunlugu;

    public Qarangush(String ad, String ayagUzunlugu) {
        super(ad);
        this.ayagUzunlugu = ayagUzunlugu;
    }

    @Override
    public void fly() {
        System.out.println("Qaranqush uchur");
    }

    @Override
    public void move() {
        System.out.println("Qaranqush hereket edir");
    }

}
