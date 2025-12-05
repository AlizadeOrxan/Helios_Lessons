package streamExample;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

//
//        List<String> names = Arrays.asList("Murad","Mahir","Nazim","Nurlane","Mehemmed");
//
//        names.stream()
//                .filter(name -> name.length() > 5)
//                .filter(namee -> namee.startsWith("M"))
//                .forEach(System.out::println);

//        List<String> words = Arrays.asList("Java", "is", "awesome");
//
//
//        String collect = words.stream()
//                .collect(Collectors.joining(",", "[", "]"));
//
//        System.out.println(collect);
//
//
////        List<Integer> numbers = Arrays.asList(5, 10, 15, 20);
//
//
//        Integer reduce = numbers.stream()
//                .reduce(0, (x, y) -> x + y);
//        System.out.println(reduce);
//
//
//        words.stream()
//                .filter(word -> word.equalsIgnoreCase("Aava"))
//                .map(wors -> wors.startsWith("J"))
//                .forEach(a -> System.out.println("Soz tapildi ve  yazildi " + a));
//
//        words.stream()
//                .findFirst()
//                .ifPresent(System.out::println);
//
//
//        IntSummaryStatistics collect1 = numbers.stream()
//                .collect(Collectors.summarizingInt(n -> n));
//
//        System.out.println(collect1.getAverage());
//





        /// ////////////

        // ==============================
        // 1️⃣ Mətnlərdən Söz Sayı və Uzunluq Orta Hesabı
        // ==============================
        List<String> words1 = Arrays.asList("elephant", "cat", "banana", "dog", "kiwi", "tiger");

        List<String> longWords = words1.stream()
                .filter(w -> w.length() > 5)
                .toList();

        int count = longWords.size();
        double avgLength = longWords.stream()
                .mapToInt(String::length)
                .average()
                .orElse(0);

        System.out.println("5 hərfdən uzun sözlər: " + longWords);
        System.out.println("Ümumi say: " + count + ", Orta uzunluq: " + avgLength);

        // ==============================
        // 2️⃣ Ədədləri Kateqoriyaya görə Qruplaşdırma
        // ==============================
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);

        Map<String, List<Integer>> grouped = numbers.stream()
                .collect(Collectors.groupingBy(n -> (n % 2 == 0 ? "Cüt" : "Tək")));

        System.out.println("Tək və cüt ədədlər: " + grouped);

        // ==============================
        // 3️⃣ Mətn Transformasiyası – Bütün hərfləri böyük
        // ==============================
        List<String> fruits = Arrays.asList("apple", "banana", "kiwi");

        List<String> upperFruits = fruits.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println("Böyük hərflə meyvələr: " + upperFruits);

        // ==============================
        // 4️⃣ Ədədlərin Kvadratını Tapma
        // ==============================
        List<Integer> nums2 = Arrays.asList(1,2,3,4,5);

        List<Integer> squares = nums2.stream()
                .map(n -> n * n)
                .toList();

        System.out.println("Ədədlərin kvadratı: " + squares);

        // ==============================
        // 5️⃣ Sözləri İlk Hərfinə görə Qruplaşdırma
        // ==============================
        List<String> words2 = Arrays.asList("apple", "apricot", "banana", "blueberry", "cherry");

        Map<Character, List<String>> groupedByFirstChar = words2.stream()
                .collect(Collectors.groupingBy(w -> w.charAt(0)));

        System.out.println("Sözlərin ilk herfine gore " + groupedByFirstChar);
    }
}
