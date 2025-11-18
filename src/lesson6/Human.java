package lesson6;

public class Human {

    private String name;
    private String surname;
    int age;
    boolean isSwimming;
    private String gender;
    Phone phone;
    Human friend;


    public Human(String name, String surname, int age, boolean isSwimming) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.isSwimming = isSwimming;
    }



    void showInfo(){
        System.out.println("Name: "+name);
        System.out.println("Surname: "+surname);
    }

    int calculate(int a , int b){
        return a*b;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", isSwimming=" + isSwimming +
                '}';
    }
}
