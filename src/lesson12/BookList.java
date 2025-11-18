package lesson12;

public class BookList {
    String name;
    int year;

    public BookList(String name, int year) {
        this.name = name;
        this.year = year;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BookList{" +
                "name='" + name + '\'' +
                year + '}';
    }
}
