package lesson17.deadlockSync;

public class DeadlockToolDemo {
    public static void main(String[] args) {

        Tool chekic = new Tool("Chekic");
        Tool burgac =  new Tool("Burgac");

        Worker ischiA = new Worker(chekic,burgac);
        Worker ishchiB = new Worker(burgac,chekic);

        Thread t1 =  new Thread(ischiA, "Ishchi A");
        Thread t2 = new Thread(ishchiB, "Ishchi B");

        t1.start();
        t2.start();


    }
}
