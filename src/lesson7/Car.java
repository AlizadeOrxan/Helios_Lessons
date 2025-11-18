package lesson7;

public class Car extends Vehichle{

    String name ;
    String brand ;
    int publicationYear ;

    public Car(String name, String brand, int publicationYear) {
        this.name = name;
        this.brand = brand;
        this.publicationYear = publicationYear;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name" + name);
        System.out.println("Brand" + brand);
        System.out.println("PublicationYear" + publicationYear);
    }

    @Override
    public void calculatePrice(int a, int b) {
        System.out.println(a + b );
    }


    @Override
    public void start() {
        super.start();
        System.out.println("Starting car ");
    }


    public static int add(int a, int b) {
        return a + b;
    }


}
