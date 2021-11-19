package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "publishers")
public class Publisher implements Serializable {
    @Id
    @Column(unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer publisher_id;
    private String name;
    private String url;
    
    public Publisher(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public Publisher() {
    }

    /**
     * @param publisherID the publisherID to set
     */
    public void setPublisherID(Integer publisher_id) {
        this.publisher_id = publisher_id;
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
}