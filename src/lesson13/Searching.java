package lesson13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Searching {
    public static void main(String[] args) {

        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 1_000_000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

        long start = System.nanoTime();
        arrayList.get(500_000);
        long end = System.nanoTime();
        System.out.println("ARRAY LIST " + (end - start));


        long start1 = System.nanoTime();
        linkedList.get(500_000);
        long end1 = System.nanoTime();
        System.out.println("LINKED LIST " + (end1 - start1));



    }
}
