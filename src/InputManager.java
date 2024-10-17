import java.util.InputMismatchException;
import java.util.Scanner;

public class InputManager {
    Scanner scanner = new Scanner(System.in);

    public int intInput() {
        while(true) {
            if(scanner.hasNextInt()) {
                try {
                    return scanner.nextInt();
                } catch(InputMismatchException e) {
                    scanner.nextLine();
                    System.out.println("Invalid input!");
                }
            }
        }
    }

    public String stringInput() {
        while(true) {
            if(scanner.hasNext()) {
                try {
                    int i = Integer.parseInt(scanner.nextLine());
                } catch(NumberFormatException e) {
                    return scanner.nextLine();
                }
                System.out.println("Invalid input!");
            }
        }
    }
}
