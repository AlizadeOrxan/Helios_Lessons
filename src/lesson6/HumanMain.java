package lesson6;

import java.util.Scanner;

public class HumanMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Adinizi daxil edin");
        String name = sc.nextLine();
        System.out.println("Soyadinizi");
        String surname = sc.nextLine();
        System.out.println("Yashiniz");
        int age = sc.nextInt();
        System.out.println("Uzmek");
        boolean uzmek = sc.nextBoolean();

        Human human = new Human(name,surname,age,uzmek);
        System.out.println(human);






    }
}
