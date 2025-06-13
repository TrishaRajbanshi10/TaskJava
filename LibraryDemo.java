// 8. You are building a library management system. 
// Design an interface named "LibraryItem" with the following methods:
// String getTitle() to retrieve the title of the library item
// String getAuthor() to retrieve the author of the library item
// int getYear() to retrieve the publication year of the library item
// boolean isAvailable() to check if the library item is currently available for borrowing.



// Interface: LibraryItem
interface LibraryItem {
    String getTitle();
    String getAuthor();
    int getYear();
    boolean isAvailable();
}

// Example implementation: Book
class Book implements LibraryItem {
    private String title;
    private String author;
    private int year;
    private boolean available;

    public Book(String title, String author, int year, boolean available) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.available = available;
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

    public boolean isAvailable() {
        return available;
    }

    // Additional method to update availability
    public void setAvailable(boolean available) {
        this.available = available;
    }
}

// Main class to test
public class LibraryDemo {
    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell", 1949, true);

        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Year: " + book1.getYear());
        System.out.println("Available: " + book1.isAvailable());
    }
}

