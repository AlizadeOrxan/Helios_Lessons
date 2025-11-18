package lesson12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExampleGenerics {
    public static void printList(List<? super Integer> list) {



        list.add(1);
        list.add(32);
        list.add(4);


        for (Object e : list){
            System.out.println(e);
        }

    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        List<Number> numbers = new ArrayList<>();
        List<Object> objects = new ArrayList<>();
        printList(list);
        printList(numbers);
        printList(objects);


    }

}
