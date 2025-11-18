package lesson8.classTask;

public class Employee extends Person implements Trainable , Workable{

    public Employee(String name, String surname, int age) {
        super(name, surname, age);
    }

    @Override
    public void work() {
        System.out.println(name + " ishleyir");

    }

    @Override
    public void attendTraining() {
        System.out.println(name + " idman ede bilir");
    }
}
