package lesson21;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPIExample {
    public static void main(String[] args) {

//
//        List<String> names = Arrays.asList("Ayanaaa", "Samir", "Leyla","Zamin", "Tural","Mehemmed","Aydin","Aydan","Nurlan","Aynur");
//
//
//         names.stream()
//                .filter(a -> a.startsWith("A"))
//                .map(a -> a.length() > 5 )
//                 .forEach(System.out::println);
//
//


//        List<Integer> numbers = Arrays.asList(78,23,1,43,43,544,3,83,2,34,28,28,345,9);


//     List<Integer> reqemler =   numbers.stream()
//                .distinct()
//                .filter(n -> n > 50)
//                .map(n -> n + 5)
//                .collect(Collectors.toList());
//        System.out.println(reqemler);
//
//        reqemler.stream()
//                .filter(n -> n > 300)
//                .forEach(System.out::println);
//
//
////////
//
//        IntStream.iterate(5, a -> a*2)
//                .limit(10)
//                .forEach(System.out::println);

//
//        names.stream()
//                .skip(3)
//                .filter(n -> n.contains("n"))
//                .forEach(System.out::println);




//        List<Integer> reqemler = Arrays.asList(10,2,9, 20,37, 30, 40, 50);


//        Integer reduce = reqemler.stream()
//                .reduce(70, Integer::sum);
//        System.out.println(reduce);

//
//        long count = reqemler.stream()
//                .filter(n -> n > 10)
//                .count();
//        System.out.println(count);
//
//
//
//        List<Product> products = Arrays.asList(
//                new Product("Laptop", true),
//                new Product("Mouse", true),
//                new Product("Keyboard", false)
//        );


//        boolean laptop = products.stream()
//                .anyMatch(product -> (product.getName().equals("Laptop")&&product.isStock()));
//        System.out.println(laptop);
//
//        System.out.println(products.stream()
//                .noneMatch(product -> product.getName().equals("Electronics")));
//
//        boolean b = products.stream()
//                .allMatch(Product::isStock);
//        System.out.println(b);


//        List<String> names = Arrays.asList("Murad","Zeynal","Nurlan","Azer","Xeyale","Kenan","Nurlan");
//
//
//        names.stream()
//                .findAny()


//
//        List<String> words = Arrays.asList("Java ", "is ", " awesome");
//
//
//        String collect = words.stream()
//                .collect(Collectors.joining(",","[","]"));
//
//        System.out.println(collect);
//
//
//        List<Integer> num = Arrays.asList(5, 10, 15, 20, 30);
//
//
//        Integer collect = num.stream()
//                .collect(Collectors.summingInt(n -> n));
//
//        System.out.println(collect);
//
//
//        System.out.println("+_______________________+");
//
//        IntSummaryStatistics collect1 = num.stream().collect(Collectors.summarizingInt(n -> n));
//
//
//        System.out.println("Minimum deyer -> " + collect1.getMin());
//        System.out.println("Maximum deyer -> " + collect1.getMax());
//        System.out.println("Sum -> " + collect1.getSum());
//        System.out.println("Average -> " + collect1.getAverage());






        List<String> names = Arrays.asList("Murad","Ali","Xeyale","Nurlan","Ceyhun","Cavid","Azer","Mahir","Namiq");


        Map<Character, List<String>> collect = names.stream()
                .collect(Collectors.groupingBy(m -> m.charAt(0)));
        System.out.println(collect);

//
//        long count = names.stream()
//                .filter(n -> n.length() > 5)
//                .count();
//
//        System.out.println(count);

        names.stream()
                .filter(s -> s.length() > 2)
                .filter(s -> s.charAt(1) == 'u')
                .forEach(System.out::println);
//



    }
}
