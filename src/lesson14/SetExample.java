package lesson14;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {


        Set<Student> set = new TreeSet<>();

        set.add(new Student(19,"Tural"));
        set.add(new Student(16,"Huseyn"));
        set.add(new Student(30,"Ali"));
        set.add(new Student(36,"Murad"));

        set.forEach(System.out::println);



    }
}
