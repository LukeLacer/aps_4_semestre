package model;

import java.util.ArrayList;

//Created By Victor Hugo(VeK) on 01/11/2021
//01/11/2021 - Building the class atributes 
//10/11/2021 - Creating methods to check the atributes before creating the object
//Obs: I will decide later if the Publisher needs to be checked
public class Book {

    // ----------------------------------------------------------------------
    // Atributes
    // ----------------------------------------------------------------------

    private String title; // Book Title -- Char(60) on DB
    private String isbn; // Book ISBN -- Char(13) on DB
    private Integer publisherID; // Book publisher ID
    private Double price; // Book price
    // VeK: This Arraylist is used to store all the books created inside this
    // arraylist
    // If you have a better idea about how to store this in a better way, please
    // share
    public static ArrayList<Book> books = new ArrayList<Book>();

    // ----------------------------------------------------------------------
    // Constructors
    // ----------------------------------------------------------------------

    public Book(String title, String isbn, Integer publisherID, Double price) {
        // Formatting the price
        price = priceTreatment(price);

        // Verifying all conditions before proceding to create the class
        boolean conditionsOk = true;
        String errors = "Erros:\n"; // String to display the errors if there are any
        if (!isbnCheck(isbn)) { // Checking if the isbn is ok
            conditionsOk = false;
            errors += "O ISBN está repetido\n";
        }
        if (!priceCheck(price)) { // Checking if the isbn is ok
            conditionsOk = false;
            errors += "O preço é inválido\n";
        }

        // if the conditions are ok, proceeds with the creation of the object
        if (conditionsOk) {
            this.title = title;
            this.isbn = isbn;
            this.publisherID = publisherID;
            this.price = price;

            // Adding the book to the books arraylist
            books.add(new Book(this.title, this.isbn, this.publisherID, this.price, true));
        } else {
            System.out.println("Houve erros na criação do Livro:");
            System.out.println(errors);
        }
    }

    // Private constructor used to insert objects on 'books' arraylist
    private Book(String title, String isbn, Integer publisherID, Double price, boolean flag) {
        this.title = title;
        this.isbn = isbn;
        this.publisherID = publisherID;
        this.price = price;
    }

    // ----------------------------------------------------------------------
    // Setters
    // ----------------------------------------------------------------------

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

    // ----------------------------------------------------------------------
    // Getters
    // ----------------------------------------------------------------------

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

    // ----------------------------------------------------------------------
    // Functions
    // ----------------------------------------------------------------------

    // Checking the title
    public boolean titleCheck(String title) {
        boolean isTitleOk = true;
        // Verifying the title length
        if (title.length() == 0 || title.length() > 60) {
            isTitleOk = false;
            System.out.println("Tamanho do título inválido");
        }
        return isTitleOk;
    }

    // Checking the ISBN
    public boolean isbnCheck(String isbn) {
        boolean isISBNOk = true;
        // Verifying the ISBN Length
        if (isbn.length() == 0 || isbn.length() > 13) {
            isISBNOk = false;
            System.out.println("Tamanho do ISBN inválido");
        }

        // Verifying if the isbn is repeated
        // checks if there is another equal isbn on books arraylist
        for (Book book : books) { // iterating on book arraylist
            if (book.getISBN() == isbn) { // verifies if the isbn already exists on DB
                isISBNOk = false;
            }
        }

        return isISBNOk;
    }

    // Formating Price
    public Double priceTreatment(Double price) {
        // Making the price positive, if it's negative
        if (price < 0) {
            price *= -1;
        }

        // Formatting the price to 2 digits Decimal number
        String treatmentAux = String.format("%.2f", price);
        if (treatmentAux.length() == 0 || treatmentAux.length() > 11) { // The price cannot have more than 10 numbers
            System.out.println("Erro de Preço: Tamanho inválido -> Retornando -1 no Preço");
            treatmentAux = String.format("%.2f", -1); // If the price is negative, there is a error
        }

        treatmentAux = treatmentAux.replace(',', '.');
        // System.out.printf("treatmentAux: '%s'", treatmentAux);
        Double treatedPrice = Double.parseDouble(treatmentAux);
        return treatedPrice;
    }

    // Checking the price
    public boolean priceCheck(Double price) {
        boolean isPriceOk = true;
        // Verifying if the price is positive
        if (price < 0) {
            isPriceOk = false;
            System.out.println("Preço Inválido: Valor Negativo");
        }

        // Verifying price length
        if (price > 9999999999d) {
            isPriceOk = false;
            System.out.println("Preço Inválido: Valor Muito Grande");
        }
        return isPriceOk;
    }

    // Removes book from arraylist
    public void removeBook(String isbn) {
        for (Book book : books) {
            if (book.getISBN().equals(isbn)) {
                books.remove(book);
                return;
            }
        }

        System.out.println("Livro não encontrado");
    }

    // Maybe this will check if the publisher exists
    /*
     * public boolean publisherCheck(Integer publisherID){ boolean isPublisherOk =
     * true;
     * 
     * return isPublisherOk; }
     */
}
