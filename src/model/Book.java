package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Book implements Serializable {
    @Id
    @Column(unique = true)
    private String isbn;
    private String title;
    private Integer publisher_id;
    private Double price;

    public Book(){}
 
    public Book(String title, String isbn, Integer publisherID, Double price) {
        this.title = title;
        this.isbn = isbn;
        this.publisher_id = publisherID;
        this.price = price;
    }
    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setISBN(String isbn) {
        this.isbn = isbn;
    }

    /**
     * @param publisherID the publisherID to set
     */
    public void setPublisherID(Integer publisherID) {
        this.publisher_id = publisherID;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Double price) {
        this.price = price;
    }
    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return the isbn
     */
    public String getISBN() {
        return isbn;
    }

    /**
     * @return the publisherID
     */
    public Integer getPublisherID() {
        return publisher_id;
    }

    /**
     * @return the price
     */
    public Double getPrice() {
        return price;
    }
}
