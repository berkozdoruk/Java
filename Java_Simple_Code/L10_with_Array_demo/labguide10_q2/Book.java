
package labguide10_q2;


public class Book {

    private int id;
    private String name;
    private String author;
    private int year;
    private double price;
    private static int lastUsedBookId = 99;

    public Book(String name, String author, int year, double price) {
        super();
        this.id = ++lastUsedBookId;
        this.name = name;
        this.author = author;
        this.year = year;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "\n\nBook:\n\nId= " + id + "\nName= " + name + "\nAuthor= " + author + "\nYear= " + year + "\nPrice= " + price + "\n";
    }

}
