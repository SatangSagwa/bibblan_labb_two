import java.util.HashMap;
import java.util.Map;

public class Librarian extends User{
    Map<Integer, Bok> allBooks;
    Map<Integer, Customer> customers;
    int booksIndex = 1;
    int customerIndex = 1;

    public Librarian(String name) {
        super(name);
        this.allBooks = new HashMap<>();
        this.customers = new HashMap<>();
    }

    public void addBook(Bok book) {
        allBooks.put(booksIndex++, book);
    }

    public void removeBook(int index) {
        booksIndex = 1;
        for (Bok book : allBooks.values()) {
            System.out.println(booksIndex + book.toString());
        }
        allBooks.remove(index);
    }

    public void listAvailableBooks() {
        for (Bok book : allBooks.values()) {
            if (book.getAvailable()) {
                System.out.println(book.toString());
            }
        }
    }

    public void listUnavailableBooks() {
        for (Bok book : allBooks.values()) {
            if (!book.getAvailable()) {
                System.out.println(book.toString());
            }
        }
    }
}
