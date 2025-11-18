package lesson12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Example {
    public static void main(String[] args) {


        //SEarching

//        LinkedList<Integer> linkedList = new LinkedList<>();
//        ArrayList<Integer> arrayList = new ArrayList<>();
//
//        for (int i = 0; i < 1_000_000; i++) {
//            linkedList.add(i);
//            arrayList.add(i);
//        }
//
//        long start = System.nanoTime();
//        arrayList.get(500_000);
//        long end = System.nanoTime();
//        System.out.println("ARRAY LIST " + (end - start));
//
//
//        long start1 = System.nanoTime();
//        linkedList.get(500_000);
//        long end1 = System.nanoTime();
//        System.out.println("LINKED LIST " + (end1 - start1));

        // Insertion to end
//        List<Integer> arrayList = new ArrayList<>();
//        List<Integer> linkedList = new LinkedList<>();
//
//        // Sona 1.000.000 element əlavə
//        long start = System.nanoTime();
//        for (int i = 0; i < 1_000_000; i++) {
//            arrayList.add(i);
//        }
//        long end = System.nanoTime();
//        System.out.println("ArrayList sona əlavə: " + (end - start));
//
//        start = System.nanoTime();
//        for (int i = 0; i < 1_000_000; i++) {
//            linkedList.add(i);
//        }
//        end = System.nanoTime();
//        System.out.println("LinkedList sona əlavə: " + (end - start));


        // Insertion
//        List<Integer> arrayList = new ArrayList<>();
//        List<Integer> linkedList = new LinkedList<>();
//
//        // Başdan 10000 element əlavə
//        long start = System.nanoTime();
//        for (int i = 0; i < 10000; i++) {
//            arrayList.add(0, i);
//        }
//        long end = System.nanoTime();
//        System.out.println("ArrayList başdan əlavə: " + (end - start));
//
//        start = System.nanoTime();
//        for (int i = 0; i < 10000; i++) {
//            linkedList.add(0, i);
//        }
//        end = System.nanoTime();
//        System.out.println("LinkedList başdan əlavə: " + (end - start));

        //Burada LinkedList daha sürətli olacaq (O(1)),
        // ArrayList isə elementləri sürüşdürməli olduğu üçün yavaşdır.


        List<Integer> list = new LinkedList<>();

    }
}
