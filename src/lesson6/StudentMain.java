package lesson6;

public class StudentMain {
    public static void main(String[] args) {

        Student st1 = new Student("Nizami",16,288);
        Student st2 = new Student("Kamal",17,155);


        System.out.println("Ilk telebe");
        st1.showInfo();
        System.out.println();
        System.out.println("2ci telebe");
        st2.showInfo();


    }
}
