package lesson13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ToEndInsertion {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long start = System.nanoTime();
        for (int i = 0; i < 1_000_000; i++) {
            arrayList.add(i);
        }
        long end = System.nanoTime();
        System.out.println("ArrayList sona elave : " + (end - start));

        start = System.nanoTime();
        for (int i = 0; i < 1_000_000; i++) {
            linkedList.add(i);
        }
        end = System.nanoTime();
        System.out.println("LinkedList sona elave : " + (end - start));


    }
}
