package lesson8.classTask;

abstract class Person {

    String name;
    String surname;
    int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    void printInfo(){
        System.out.println("Name is " + name);
        System.out.println("Surname is " + surname);
        System.out.println("Age is " + age);

    }
}
