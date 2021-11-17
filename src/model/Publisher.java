package model;

import java.util.ArrayList;

//Created By Victor Hugo(VeK) on 10/11/2021
//10/11/2021 - Building the Class
//Classe de Editoras - Publisher Class
public class Publisher {

    // ----------------------------------------------------------------------
    // Atributes
    // ----------------------------------------------------------------------

    private Integer publisherID; // INT type on DB
    private String name; // Char(30) on DB
    private String url; // Char(80) on DB
    // VeK: This Arraylist is used to store all the publishers created inside this
    // arraylist
    // If you have a better idea about how to store this in a better way, please
    // share
    public static ArrayList<Publisher> publishers = new ArrayList<Publisher>();

    // ----------------------------------------------------------------------
    // Constructors
    // ----------------------------------------------------------------------

    public Publisher(Integer publisherID, String name, String url) {
        this.publisherID = publisherID;
        this.name = name;
        this.url = url;
        // Adding the same object values to arraylist
        publishers.add(new Publisher(this.getPublisherID(), this.getName(), this.getUrl(), true));
    }

    // Private constructor used to insert objects on 'publishers' arraylist
    public Publisher(Integer publisherID, String name, String url, boolean flag) {
        this.publisherID = publisherID;
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
        this.publisherID = publisherID;
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
        return publisherID;
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