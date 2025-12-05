package lesson22.Observer;

public class Student implements Subscriber {

    private String name;

    public Student(String name) {
        this.name = name;
    }
    @Override
    public void update(String news) {
        System.out.println(name + " yeni xəbəri qəbul etdi: " + news);

    }
}
