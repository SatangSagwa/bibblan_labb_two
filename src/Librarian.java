import java.util.HashMap;
import java.util.Map;

//Ärver User
public class Librarian extends User{
    Map<Integer, Bok> allBooks;
    Map<Integer, Customer> customers;
    int booksIndex = 1;
    int customerIndex = 1;

    //Kontruktor
    public Librarian(String name, String password) {
        super(name, password);
        this.allBooks = new HashMap<>();
        this.customers = new HashMap<>();
    }

    public void addCustomer(Customer customer) {
        customers.put(customerIndex++, customer);
    }

    public void listAllCustomers() {
        customerIndex = 1;
        for (Customer customer : customers.values()) {
            System.out.println(customerIndex++ + customer.getName());
        }
    }

    public void addBook(Bok book) {
        allBooks.put(booksIndex++, book);
    }

    public void removeBook(int index) {
        booksIndex = 1;
        for (Bok book : allBooks.values()) {
            System.out.println(booksIndex++ + book.toString());
        }
        allBooks.remove(index);
    }

    public void listAvailableBooks() {
        booksIndex = 1;
        for (Bok book : allBooks.values()) {
            if (book.getAvailable()) {
                System.out.println(booksIndex++ + ": " + book.getTitle());
            }
        }
    }

    public void listUnavailableBooks() {
        booksIndex = 1;
        for (Bok book : allBooks.values()) {
            if (!book.getAvailable()) {
                System.out.println(booksIndex + book.getTitle());
            }
        }
    }
}
