package hw6;

public class Book {

    private int id;
    private String name;
    private String author;
    private String publisher;
    private int year;
    private int quantityPages;
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public Book(int id, String name, String author, String publisher, int year, int quantityPages, double price) {

        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.quantityPages = quantityPages;
        this.price = price;
    }

    public void view() {
        System.out.println("id: " + id + ", name: " + name + ", author: " + author + ", publisher: " + publisher + ", year: "
                + year + ", quantityPages: " + quantityPages + ", price: " + price);
    }
}
