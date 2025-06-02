//Let's examine the Java program given.
//  It involves multiple classes that depict different book types, including Book, FictionBook, NonFictionBook, and TechnicalBook. 
// The Book class features a constructor and a method called displayDetails(). 
// This method is responsible for outputting the title and author of a book. 
// The remaining classes inherit both the constructor and methods of the Book class as they extend it.

// Base class
class Book {
    protected String title;
    protected String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class FictionBook extends Book {
    public FictionBook(String title, String author) {
        super(title, author);
    }
}

class NonFictionBook extends Book {
    public NonFictionBook(String title, String author) {
        super(title, author);
    }
}

class TechnicalBook extends Book {
    public TechnicalBook(String title, String author) {
        super(title, author);
    }
}

public class BookDemo {
    public static void main(String[] args) {
        FictionBook f = new FictionBook("1984", "George Orwell");
        NonFictionBook nf= new NonFictionBook("Sapiens", "Yuval Noah Harari");
        TechnicalBook t = new TechnicalBook("Java: The Complete Reference", "Herbert Schildt");

        System.out.println("Fiction Book Details:");
        f.displayDetails();

        System.out.println("\nNon-Fiction Book Details:");
        nf.displayDetails();

        System.out.println("\nTechnical Book Details:");
        t.displayDetails();
    }
}
