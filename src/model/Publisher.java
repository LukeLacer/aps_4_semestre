package model;

import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.swing.text.html.HTMLDocument.RunElement;

@Entity
@Table(name = "Publishers")
public class Publisher {

    // ----------------------------------------------------------------------
    // Atributes
    // ----------------------------------------------------------------------
    @Id
    @Column(unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer publisher_id; // INT type on DB
    private String name; // Char(30) on DB
    private String url; // Char(80) on DB
    public static ArrayList<Publisher> publishers = new ArrayList<Publisher>();

    // ----------------------------------------------------------------------
    // Constructors
    // ----------------------------------------------------------------------
    public Publisher() {}
    
    public Publisher(Integer publisherID, String name, String url) {
        this.publisher_id = publisherID;
        this.name = name;
        this.url = url;
        // Adding the same object values to arraylist
        publishers.add(new Publisher(this.getPublisherID(), this.getName(), this.getUrl(), true));
    }

    // Private constructor used to insert objects on 'publishers' arraylist
    public Publisher(Integer publisherID, String name, String url, boolean flag) {
        this.publisher_id = publisherID;
        this.name = name;
        this.url = url;
    }

    // ----------------------------------------------------------------------
    // Setters
    // ----------------------------------------------------------------------

    /**
     * @param publisherID the publisherID to set
     */
    public void setPublisherID(Integer publisherID) {
        this.publisher_id = publisherID;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    // ----------------------------------------------------------------------
    // Getters
    // ----------------------------------------------------------------------

    /**
     * @return the publisherID
     */
    public Integer getPublisherID() {
        return publisher_id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    // ----------------------------------------------------------------------
    // Functions
    // ----------------------------------------------------------------------

    public boolean checkName(String name) {
        boolean isNameOK = true;

        if (name.length() < 1 || name.length() > 30) {
            isNameOK = false;
            System.out.println("Tamanho de nome de editora inválido");
        }

        return isNameOK;
    }

    public boolean checkURL(String name) {
        boolean isUrlOK = true;

        if (name.length() < 1 || name.length() > 80) {
            isUrlOK = false;
            System.out.println("Tamanho de nome de editora inválido");
        }

        return isUrlOK;
    }

    // Removing Publisher from ArrayList
    public void removePublisher(Integer publisherID) {
        for (Publisher publisher : publishers) {
            if (publisher.getPublisherID().equals(publisherID)) {
                publishers.remove(publisher);
                return;
            }
        }
        System.out.println("Editora não encontrada");
    }

}