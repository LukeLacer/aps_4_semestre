package model;
import java.util.ArrayList;

//Created By Victor Hugo(VeK) on 01/11/2021
//01/11/2021 - Building the class atributes 
public class Book {

//----------------------------------------------------------------------
// Atributes    
//----------------------------------------------------------------------
    
    private String title; //Book Title
    private String isbn; //Book ISBN
    private Integer publisherID; //Book publisher ID
    private Double price; //Book price
    //VeK: This Arraylist is used to store all the books created inside this arraylist
    //If you have a better idea about how to store this in a better way, please share
    private static ArrayList<Book> books = new ArrayList<Book>();
    
//----------------------------------------------------------------------
// Constructors    
//----------------------------------------------------------------------
    
    public Book(String title, String isbn, Integer publisherID, Double price){
        //Verifying if the isbn is repeated
        boolean isbnRepeated = false;
            //checks if there is another equal isbn on books arraylist
        for(Book book : books){ //iterating on book arraylist
            if(book.getISBN()==isbn){ //verefies if the isbn already exists on DB
                isbnRepeated = true;
            }
        }
        //Verifying if the price is greater or equal than zero
        boolean isPriceOk = true;
        if(price<0){
            isPriceOk = false;
        }
        
        //Verifying all conditions before proceding to create the class
        boolean conditionsOk = true;
        String errors = "Erros:\n"; //String to display the errors if there are any
        if(isbnRepeated){
            conditionsOk = false;
            errors += "O ISBN está repetido\n";
        }
        if(!isPriceOk){
            conditionsOk = false;
            errors += "O preço é menor que 0\n";
        }
        
        //if the isbn isn't reapeated, proceeds to create the object
        if(conditionsOk){ 
            this.title = title;
            this.isbn = isbn;
            this.publisherID = publisherID;
            this.price = price;
            
            //Adding the book to the books arraylist
            books.add(new Book(this.title,this.isbn,this.publisherID,this.price,true)); 
        } else {
            System.out.println("Houve erros na criação do Livro:");
            System.out.println(errors);
        }
    }
    
    //Private constructor used to insert objects on books arraylist
    private Book(String title, String isbn, Integer publisherID, Double price, boolean flag){
        this.title = title;
        this.isbn = isbn;
        this.publisherID = publisherID;
        this.price = price;
    }   

//----------------------------------------------------------------------
// Setters    
//----------------------------------------------------------------------

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
        this.publisherID = publisherID;
    }
    
    /**
     * @param price the price to set
     */
    public void setPrice(Double price) {
        this.price = price;
    }
    
//----------------------------------------------------------------------
// Getters    
//----------------------------------------------------------------------
    
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
        return publisherID;
    }

    /**
     * @return the price
     */
    public Double getPrice() {
        return price;
    }
    
    
//----------------------------------------------------------------------
// Functions    
//----------------------------------------------------------------------
    
    
}
