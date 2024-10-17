public class Main {

           public static void main(String[] args) {
               InputManager inputManager = new InputManager();
               Librarian librarian = new Librarian("Librarian", "");

               //Kunder
               Customer customer = new Customer("Emilia", "");
               Customer customer2 = new Customer("Simon", "");
               Customer customer3 = new Customer("Andy", "");
               Customer customer4 = new Customer("Mohammad", "");

               //Böcker
               Bok book1 = new Bok("hej", "author", "description");
               Bok book2 = new Bok("hejdå", "author1", "description1");

               //Lägger till böcker i biblioteket
               librarian.addBook(book1);
               librarian.addBook(book2);
               librarian.addBook(new Bok("SomeTitle", "author2", "description2"));

               //Visar alla tillgängliga böcker
               librarian.listAvailableBooks();

               //Lånar en bok till en användare
               customer.rentBook(book1);
               customer.rentBook(book2);

               //Visar alla böcker som en användare har lånat
               customer.viewMyBooks();

               //Returnerar en lånad bok med index
               customer.returnBook(1);

               //Visar alla böcker som en användare har lånat
               customer.viewMyBooks();

               librarian.customers.get(1).viewMyBooks();

    }
}