import java.util.*;
class Book
 {
    private String title;
    private String author;
    private double price;
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void displayDetails() {
        System.out.println("\nBook Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
    public void applyDiscount() {
        double discountPercentage = 0.0;
        if (price <= 100) {
            discountPercentage = 5.0;
        } else if (price <= 400) {
            discountPercentage = 10.0;
        } else if (price <= 800) {
            discountPercentage = 15.0;
        } else if (price <= 1200) {
            discountPercentage = 20.0;
        } else
       {
            discountPercentage = 35.0;
        }
        price -= price * discountPercentage / 100;
        System.out.println("Discount applied! Discount Percentage: " +  discountPercentage + "%");
        System.out.println("New price after discount: $" + price);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter the author's name: ");
        String author = scanner.nextLine();
        System.out.print("Enter the book price: ");
        double price = scanner.nextDouble();
        Book book = new Book(title, author, price);
        book.displayDetails();
        book.applyDiscount();
        book.displayDetails();
        scanner.close();
    }
}
