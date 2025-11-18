package lesson16;

public class ExampleThread implements Runnable {

    String name;

    public ExampleThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <=5; i++) {
            System.out.println(name+ " Bashladi ");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e) {
                System.out.println(
                        "Interrupted"
                );
            }

        }
        System.out.println(name + " ishini bitirdi");

    }
}

