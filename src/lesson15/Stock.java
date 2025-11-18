package lesson15;

import java.util.HashMap;
import java.util.Map;

public class Stock {
    public static void main(String[] args) {


//        Product product = new Product("Chorek", 0.60);
//        Product water = new Product("Coca-cola", 1.60);
//        Product phone = new Product("Apple", 799.60);


        Map<Product, Integer> map = new HashMap<>();


        map.put(new Product("Chorek", 0.60),10 );
        map.put(new Product("Apple", 799.60),10 );
        map.put(new Product("Apple", 799.60),10 );
        map.put(new Product("Coca-cola",1.50) , 15) ;
        map.put(new Product("Apple",650.00), 20);


        for (Map.Entry<Product, Integer> entry : map.entrySet()) {
            System.out.println(" Product "+entry.getKey() + " Say  " + entry.getValue());
        }

        System.out.println("_______________________________________________");

        map.put(new Product("Apple", 800), 20);

        for (Map.Entry<Product, Integer> entry : map.entrySet()) {
            System.out.println(" Product "+entry.getKey() + " Say  " + entry.getValue());
        }


    }
}
