package lesson1;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Xahish edirem yashinizi daxil edin");
        int age = sc.nextInt();
        System.out.println("Xahish edirem Adinizi daxil edin ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Telebesiniz mi ? ");
        boolean isStudent = sc.nextBoolean();

        System.out.println("Yashiniz -> " + age);
        System.out.println("Adiniz -> " + name);
        System.out.println("Telebesiniz ? -> " + isStudent);






    }
}
