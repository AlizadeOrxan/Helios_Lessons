package lesson21;

public class Product {
    String name;
    boolean isStock;

    public Product(String name, boolean isStock) {
        this.name = name;
        this.isStock = isStock;
    }


    public String getName() {
        return name;
    }

    public boolean isStock() {
        return isStock;
    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", isStock=" + isStock +
                '}';
    }
}
