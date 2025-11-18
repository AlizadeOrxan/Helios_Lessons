package lesson6;

public class Book {

    private String name ;
    private String author;
    private int pageCount;


    public Book(String name, String author, int pageCount) {
        this.name = name;
        this.author = author;
        this.pageCount = pageCount;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    void showInfo(){
        System.out.println("Kitabin adi " + name);
        System.out.println("Yazichinin adi " + author);
        System.out.println("Kitabin sehifesi " + pageCount);
    }


    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", pageCount=" + pageCount +
                '}';
    }
}
