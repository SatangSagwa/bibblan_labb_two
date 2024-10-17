import java.awt.print.Book;
import java.util.HashMap;
import java.util.Map;

public class Customer extends User{

    Map<Integer, Book> myBooks;
    public Customer(String name) {
        super(name);
        myBooks = new HashMap<Integer, Book>();
    }

    public void rentBook(Book book) {

    }
}
