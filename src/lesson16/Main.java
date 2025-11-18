package lesson16;

public class Main {
    public static void main(String[] args) {


        Thread thread0 = new Thread(new ExampleThread("Thhread 0"));
        Thread thread1= new Thread(new ExampleThread("Thhread 1"));
        Thread thread2 = new Thread(new ExampleThread("Thhread 2"));
        Thread thread3= new Thread(new ExampleThread("Thhread 3"));
//
//        thread0.run();
//        thread1.run();
//        thread2.run();
//        thread3.run();
//

        thread0.start();
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
