package Book;

public class BookTest {
    public static void main(String[] args) {
        Book b1 = new Book("War and Peace", "Tolstoy", 1000000);
        System.out.println(b1.toString());
        System.out.println(b1.isBoring());

    }
}
