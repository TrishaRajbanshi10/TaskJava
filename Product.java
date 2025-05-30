// You are developing an e-commerce application and need to implement a Product class. 
//The Product class should have private instance variables for the product name, product ID, and price.
// Implement getter and setter methods for these variables, ensuring that the price cannot be negative. 
//Additionally, include a private variable to track the stock quantity and provide public methods to update 
//the stock when a product is purchased or restocked.

//Encapsulation

public class Product {
    // attributes
    private String productName;
    private String productID;
    private double price;
    private int stockQuantity;

    // Constructor
    public Product(String productName, String productID, double price, int stockQuantity) {
        this.productName = productName;
        this.productID = productID;
        setPrice(price); // use setter to apply validation
        this.stockQuantity = stockQuantity;
    }

    // Getter methods
    public String getProductName() {
        return productName;
    }
    public String getProductID() {
        return productID;
    }
    public double getPrice() {
        return price;
    }
    public int getStockQuantity() {
        return stockQuantity;
    }

    // Setter methods
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public void setProductID(String productID) {
        this.productID = productID;
    }
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price cannot be negative.");
        }
    }

    // Method to restock the product
    public void restock(int quantity) {
        if (quantity > 0) {
            stockQuantity += quantity;
            System.out.println(quantity + " items restocked. New stock: " + stockQuantity);
        } else {
            System.out.println("Restock quantity must be positive.");
        }
    }

    // Method to purchase the product
    public void purchase(int quantity) {
        if (quantity <= 0) {
            System.out.println("Purchase quantity must be positive.");
        } else if (quantity > stockQuantity) {
            System.out.println("Not enough stock to complete purchase.");
        } else {
            stockQuantity -= quantity;
            System.out.println(quantity + " items purchased. Remaining stock: " + stockQuantity);
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", "P123", 750.0, 10);

        System.out.println("Product: " + p1.getProductName());
        System.out.println("ID: " + p1.getProductID());
        System.out.println("Price: " + p1.getPrice());
        System.out.println("Stock: " + p1.getStockQuantity());

        // Testing purchase
        p1.purchase(3);  // Reduce stock
        p1.purchase(15); // Exceeds stock

        // Testing restock
        p1.restock(5);   // Increase stock

        // Invalid price test
        p1.setPrice(-100); // Should print warning
    }
}


