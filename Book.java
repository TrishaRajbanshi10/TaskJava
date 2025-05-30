// 3. You are developing a library management system and need to implement a Book class. 
//The Book class should have private instance variables for the book title, author name, and publication year.
// Implement appropriate getter and setter methods to ensure encapsulation. 
//Additionally, include a private variable to track the availability of the book (e.g., true if available, false if borrowed), 
//and provide a public method to borrow the book, updating its availability status.

public class Book {
    private String book_Title;
    private String author_name;
    private int publication_year;
    private boolean isAvailable;

    // Constructor
    public Book(String book_Title, String author_name, int publication_year) {
        this.book_Title = book_Title;
        this.author_name = author_name;
        this.publication_year = publication_year;
        this.isAvailable = true; // default
    }

    // Getters and Setters
    public void setBookTitle(String book_Title) {
        this.book_Title = book_Title;
    }

    public String getBookTitle() {
        return book_Title;
    }

    public void setAuthorName(String author_name) {
        this.author_name = author_name;
    }

    public String getAuthorName() {
        return author_name;
    }

    public void setPublicationYear(int publication_year) {
        this.publication_year = publication_year;
    }

    public int getPublicationYear() {
        return publication_year;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Method to borrow book
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed the book.");
        } else {
            System.out.println("Sorry, this book is currently unavailable.");
        }
    }

    // Method to return the book
    public void returnBook() {
        isAvailable = true;
        System.out.println("The book has been returned.");
    }

    // Main method for testing
    public static void main(String[] args) {
        Book myBook = new Book("Ikigai", "Japanese", 1990);

        System.out.println("Title: " + myBook.getBookTitle());
        System.out.println("Author: " + myBook.getAuthorName());
        System.out.println("Available: " + myBook.isAvailable());

        myBook.borrowBook(); // Borrow the book
        System.out.println("Available after borrowing: " + myBook.isAvailable());

        myBook.returnBook(); // Return the book
        System.out.println("Available after return: " + myBook.isAvailable());
    }
}

