import java.util.Scanner;

public class Menu {
    private LibraryManagementSystem library;
    private Scanner scanner;

    public Menu(LibraryManagementSystem library) {
        this.library = library;
        this.scanner = new Scanner(System.in);
    }

    public void mainMenu() {
        int choice = 0;
        do {
            System.out.println("\n===== Library =====");
            System.out.println("1. Add a book");
            System.out.println("2. View all books");
            System.out.println("3. Search a book");
            System.out.println("4. Borrow a book");
            System.out.println("5. Return a book");
            System.out.println("6. Exit");
            System.out.print("Choose your option: ");
            
            if (scanner.hasNextInt()) { 
                choice = scanner.nextInt(); 
                scanner.nextLine();
            } else {
                System.out.println("Te rog să introduci un număr valid.");
                scanner.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    viewAllBooks();
                    break;
                case 3:
                    searchBooks();
                    break;
                case 4:
                    borrowBook();
                    break;
                case 5:
                    returnBook();
                    break;
                case 6:
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please choose again!");
                    break;
            }
        } while (choice != 6);
    }

    private void addBook() {
        System.out.print("Type book title: ");
        String title = scanner.nextLine();
        System.out.print("Type book author: ");
        String author = scanner.nextLine();
        library.addBook(title, author);
    }

    private void viewAllBooks() {
        System.out.println("\nAll books from library:");
        for (Books book : library.getAllBooks()) {
            System.out.println(book.getTitle() + " written by " + book.getAuthor() +
                               (book.isBorrowed() ? " (Borrowed)" : " (Available)"));
        }
    }

    private void searchBooks() {
        System.out.print("Introduce search term: ");
        String query = scanner.nextLine();
        library.searchBooks(query);
    }

    private void borrowBook() {
        System.out.print("Introduce title name of the book you want to borrow: ");
        String title = scanner.nextLine();
        library.borrowBooks(title);
    }

    private void returnBook() {
        System.out.print("Introduce title name of the book you want to return: ");
        String title = scanner.nextLine();
        library.returnBooks(title);
    }

    public static void main(String[] args) {
        LibraryManagementSystem library = new LibraryManagementSystem();
        Menu menu = new Menu(library);
        menu.mainMenu();
    }
}
