package model;

import java.util.ArrayList;

//Created By Victor Hugo(VeK) on 10/11/2021
//10/11/2021 - Building the Class
//Classe de Autores de Livros (Auxiliar) - Books Author Class
public class BooksAuthors {

    // ----------------------------------------------------------------------
    // Atributes
    // ----------------------------------------------------------------------

    private String isbn; // Char(13) on DB
    private Integer authorID;
    private Integer seqNo;
    // VeK: This Arraylist is used to store all the book authors created inside this
    // arraylist
    // If you have a better idea about how to store this in a better way, please
    // share
    public static ArrayList<BooksAuthors> booksAuthors = new ArrayList<BooksAuthors>();

    // ----------------------------------------------------------------------
    // Constructors
    // ----------------------------------------------------------------------

    public BooksAuthors(String isbn, Integer authorID, Integer seqNo) {
        this.isbn = isbn;
        this.authorID = authorID;
        this.seqNo = seqNo;
        // VeK: This Arraylist is used to store all the books authors created inside
        // this arraylist
        // If you have a better idea about how to store this in a better way, please
        // share
        booksAuthors.add(new BooksAuthors(this.getIsbn(), this.getAuthorID(), this.getSeqNo(), true));
    }

    public BooksAuthors(String isbn, Integer authorID, Integer seqNo, boolean flag) {
        this.isbn = isbn;
        this.authorID = authorID;
        this.seqNo = seqNo;
    }

    // ----------------------------------------------------------------------
    // Setters
    // ----------------------------------------------------------------------

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * @param authorID the authorID to set
     */
    public void setAuthorID(Integer authorID) {
        this.authorID = authorID;
    }

    /**
     * @param seqNo the seqNo to set
     */
    public void setSeqNo(Integer seqNo) {
        this.seqNo = seqNo;
    }

    // ----------------------------------------------------------------------
    // Getters
    // ----------------------------------------------------------------------

    /**
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @return the authorID
     */
    public Integer getAuthorID() {
        return authorID;
    }

    /**
     * @return the seqNo
     */
    public Integer getSeqNo() {
        return seqNo;
    }

}
