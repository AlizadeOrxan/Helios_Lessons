package lesson17.deadlockSync;

public class Worker implements Runnable {

    private final Tool firstTool;
    private final Tool secondTool;

    public Worker(Tool first, Tool second) {

        this.firstTool = first;
        this.secondTool = second;

//        this.firstTool = first.getName().compareTo(second.getName()) < 0 ? first : second;
//        this.secondTool = first.getName().compareTo(second.getName()) < 0 ? second : first;
    }


    @Override
    public void run() {

        synchronized (firstTool) {
            System.out.println(Thread.currentThread().getName() +
                    " goturdu: " + firstTool.getName());
            try { Thread.sleep(1000); } catch (InterruptedException e) {}

            System.out.println(Thread.currentThread().getName() +
                    " gozleyir: " + secondTool.getName());

            synchronized (secondTool) {
                System.out.println(Thread.currentThread().getName() +
                        " goturdu: " + secondTool.getName());
            }

        }
    }
}
