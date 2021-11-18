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
        booksAuthors.add(new BooksAuthors(this.getISBN(), this.getAuthorID(), this.getSeqNo(), true));
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
    public String getISBN() {
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

    // ----------------------------------------------------------------------
    // Functions
    // ----------------------------------------------------------------------

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
        for (BooksAuthors book : booksAuthors) { // iterating on book arraylist
            if (book.getISBN().equals(isbn)) { // verifies if the isbn already exists on DB
                isISBNOk = false;
            }
        }

        return isISBNOk;
    }

    // Removes book from arraylist
    public void removeBookAuthor(String isbn) {
        for (BooksAuthors bookAuthor : booksAuthors) {
            if (bookAuthor.getISBN().equals(isbn)) {
                booksAuthors.remove(bookAuthor);
                return;
            }
        }
        System.out.println("LivroAutor não encontrado");
    }
}
