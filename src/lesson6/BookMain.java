package lesson6;

public class BookMain {
    public static void main(String[] args) {

        Book book = new Book("Deli Kur","Ismayil Shixli",346);
        book.showInfo();
        System.out.println("____________________________");
        System.out.println("Deyishenden sonra");

        book.setName("7 ogul isterem");
        book.showInfo();




    }
}
