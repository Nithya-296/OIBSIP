import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nAuthor: " + author + "\nYear: " + year;
    }
}

class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void printBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

public class DigitalLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        boolean running = true;
        while (running) {
            System.out.println("1. Add book");
            System.out.println("2. Remove book");
            System.out.println("3. View all books");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter book year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine();
                    Book book = new Book(title, author, year);
                    library.addBook(book);
                    System.out.println("Book added!");
                    break;
                case 2:
                    System.out.print("Enter book title: ");
                    title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    author = scanner.nextLine();
                    System.out.print("Enter book year: ");
                    year = scanner.nextInt();
                    scanner.nextLine();
                    book = new Book(title, author, year);
                    library.removeBook(book);
                    System.out.println("Book removed!");
                    break;
                case 3:
                    library.printBooks();
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }

        scanner.close();
    }
}
