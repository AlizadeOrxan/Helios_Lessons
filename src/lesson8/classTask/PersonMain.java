package lesson8.classTask;

public class PersonMain {
    public static void main(String[] args) {

        Employee em = new Employee("Murad","Alizade",35);

        em.work();
        System.out.println("__________________");
        em.attendTraining();
        System.out.println("__________________");
        em.printInfo();



    }
}
