package Model;

/**
 * Created by Peter on 13.03.18.
 */
public class Book
{
    private int id_book;
    private String name_book;
    private String author_book;
    private double price_book;

    public double getPrice_book() {
        return price_book;
    }

    public String getAuthor_book() {
        return author_book;
    }

    public String getName_book() {
        return name_book;
    }

    public int getId_book() {
        return id_book;
    }

    public void setId_book(int id_book) {
        this.id_book = id_book;
    }

    public void setPrice_book(double price_book) {
        this.price_book = price_book;
    }

    public void setAuthor_book(String author_book) {
        this.author_book = author_book;
    }

    public void setName_book(String name_book) {
        this.name_book = name_book;
    }
}
