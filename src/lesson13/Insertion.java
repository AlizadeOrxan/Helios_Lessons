package lesson13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Insertion {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(0, i);
        }
        long end = System.nanoTime();
        System.out.println("ArrayList bashdan elave : " + (end - start));

        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.add(0, i);
        }
        end = System.nanoTime();
        System.out.println("LinkedList bashdan elave : " + (end - start));

    }
}
