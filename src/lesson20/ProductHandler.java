package lesson20;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ProductHandler {

    public void processHandler(List<Product> products,
                               Predicate<Product> predicate,
                               Consumer<Product>consumer){
        for (Product product : products) {
            if (predicate.test(product)) {
                consumer.accept(product);
            }
        }
    }
}
