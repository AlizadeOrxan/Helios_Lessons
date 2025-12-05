package lesson20;

import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MainExampleFunctional {
    public static void main(String[] args) {


//
//
//        CalculatorImpl calculator = new CalculatorImpl();
//
//        Calculate calc = new Calculate() {
//            @Override
//            public int calc(int a, int b) {
//                return a * b ;
//            }
//        };
//
//        Calculate calc2 = new Calculate() {
//            @Override
//            public int calc(int a, int b) {
//                return a - b ;
//            }
//        };
//
//
//        Calculate calc3 = (a,b) -> a*b;
//        System.out.println(calc3.calc(4, 2));
//        Calculate calc4 = (a,b) -> a+b;
//        System.out.println(calc4.calc(4, 2));
//
//

        // String::toUppercase
        // Integer::sum

//
//        StringTransform stringTransform = String::toUpperCase;
//        StringTransform stringTransform1 = (a) -> a.toUpperCase();
//        System.out.println(stringTransform1.transform("azerbaycan"));
//
//        StringTransform stringTransform2 = String::toLowerCase;
//        System.out.println(stringTransform2.transform("HELLO WORLD"));

        Predicate<String> pre = a -> a.length() > 5 ;
        System.out.println(pre.test("Hello World"));

        Predicate<Integer> predicate = p -> p > 5;
        if (predicate.test(17)){
            System.out.println("Salam");
        }


        Function<String,Integer> function = m -> m.length();
//
//        System.out.println(function.apply("Hello World"));
//
//
//        Consumer<String> consumer = (m) -> System.out.println("Salam " + m);
//        consumer.accept("Hello World");
//
//
//        Supplier<String> supplier = () -> "Hello World";
//        System.out.println(supplier.get());
//
//        Supplier<Integer> supplier1 = () -> 5;
//        System.out.println(supplier1.get());

        Supplier<String> tokenSupplier = () -> UUID.randomUUID().toString();

        System.out.println("New token: " + tokenSupplier.get());
        System.out.println("New token: " + tokenSupplier.get());




    }
}
