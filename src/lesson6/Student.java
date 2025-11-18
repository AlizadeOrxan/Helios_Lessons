package lesson6;

public class Student {
    private String name;
    private int age ;
    private int schoolNumb;

    public Student(String name, int age, int schoolNumb) {
        this.name = name;
        this.age = age;
        this.schoolNumb = schoolNumb;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSchoolNumb() {
        return schoolNumb;
    }

    public void setSchoolNumb(int schoolNumb) {
        this.schoolNumb = schoolNumb;
    }

    void showInfo(){
        System.out.println("Ad -> " + name);
        System.out.println("Age -> " + age);
        System.out.println("School -> " + schoolNumb);
    }
}
