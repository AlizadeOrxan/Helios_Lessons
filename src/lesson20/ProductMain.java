package lesson20;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ProductMain {
    public static void main(String[] args) {


        List<Product> products = List.of(
                new Product("Telefon",99,"Elektroinka"),
                new Product("Un",56,"Erzaq"),
                new Product("Qulaqciq",72,"Elektroinka"),
                new Product("T-shirt",98,"Geyim"),
                new Product("Eynek",67,"Aksessuar"),
                new Product("KIA",49,"Avtomobil"),
                new Product("Telefon",88,"Elektroinka")
        );

        ProductHandler productHandler = new ProductHandler();

        Predicate<Product> predicate = p -> p.price > 90;

        Consumer<Product> consumer = p -> System.out.println("Adi " + p.name + " - " + " Category " + p.category);

        productHandler.processHandler(products, predicate, consumer);


    }
}
