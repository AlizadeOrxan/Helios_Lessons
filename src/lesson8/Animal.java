package lesson8;

abstract class Animal {
    String ad;

    public Animal (String ad) {
        this.ad = ad;
    }

    void displayInfo(){
        System.out.println("Animal name is " + ad);
    }

}
