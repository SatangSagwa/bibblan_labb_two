public class Main {

           public static void main(String[] args) {
               InputManager inputManager = new InputManager();
               Librarian librarian = new Librarian("Librarian", "");
               Customer customer = new Customer("Emilia", "");
               Customer customer2 = new Customer("Simon", "");
               Customer customer3 = new Customer("Andy", "");
               Customer customer4 = new Customer("Mohammad", "");

               Bok book1 = new Bok("hej", "author", "description");
               Bok book2 = new Bok("hejdå", "author1", "description1");
               librarian.addBook(book1);
               librarian.addBook(book2);
               librarian.addBook(new Bok("SomeTitle", "author2", "description2"));

               librarian.listAvailableBooks();
               customer.rentBook(book1);
               customer.rentBook(book2);
               customer.viewMyBooks();
               customer.returnBook(1);
               customer.viewMyBooks();

    }
}