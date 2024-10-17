import java.util.HashMap;
import java.util.Map;

public class Customer extends User{

    Map<Integer, Bok> myBooks;
    int myBookIndex;
    public Customer(String name, String password) {
        super(name, password);
        myBooks = new HashMap<>();
    }

    public void rentBook(Bok book) {
        if(book.getAvailable()) {
            book.setAvailable(false);
            myBooks.put(myBookIndex++, book);
            System.out.println(book.getTitle() + " has been rented");
        } else {
            System.out.println("Book is not available.");
        }
    }

    public void returnBook(int index) {
        try {
            myBooks.remove(index-1);
            System.out.println("Book has been returned");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Book not found.");
        }
        }

    public void viewMyBooks() {
        myBookIndex = 1;
        for(Bok book : myBooks.values()) {
            System.out.println(myBookIndex++ + " " + book.getAuthor() + " - " + book.getTitle());
        }
    }


}
