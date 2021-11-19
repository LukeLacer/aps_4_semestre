package model;

import java.io.Serializable;

public class BooksAuthorsPk implements Serializable {
    private String isbn;
    private Integer author_id;
    
    public BooksAuthorsPk() {}
    
    public BooksAuthorsPk(String ISBN, Integer AuthorId) {
        this.isbn = ISBN;
        this.author_id = AuthorId;
    }

    /**
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * @return the author_id
     */
    public Integer getAuthor_id() {
        return author_id;
    }

    /**
     * @param author_id the author_id to set
     */
    public void setAuthor_id(Integer author_id) {
        this.author_id = author_id;
    }
}
